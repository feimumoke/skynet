package server

import (
	"context"
	"errors"
	"fmt"
	pb "github.com/dipper/AlkaidService/protorpc/image"
	"io/ioutil"
	"os"
	"path/filepath"
)

import (
	"github.com/apache/dubbo-go/config"
)

func init() {
	config.SetProviderService(NewImageServiceProvider())
}

type ImageServiceProvider struct {
	*pb.ImageServiceProviderBase
}

func NewImageServiceProvider() *ImageServiceProvider {
	return &ImageServiceProvider{
		&pb.ImageServiceProviderBase{},
	}
}


func (ims *ImageServiceProvider) Save(ctx context.Context, im *pb.ImageData) (resp *pb.ImageSaveResult, err error) {
	name := im.Name
	fmt.Printf("%v", im.Name)
	path := myconfig.ImagePath + name
	dir, _ := filepath.Split(path)
	err = os.MkdirAll(dir, os.ModePerm)
	file, err := os.Create(path)
	if err != nil {
		fmt.Printf("create file error: %v", err)
		return nil, err
	}
	n, err := file.Write(im.Photo)
	if err != nil {
		fmt.Printf("write file error: %v", err)
		return nil, err
	}
	if n <= 0 {
		fmt.Printf("write a empty file")
		return nil, errors.New("empty file")
	}
	return &pb.ImageSaveResult{
		RpcCode: 200,
		Message: "success",
		Url:     name,
	}, nil
}

func (ims *ImageServiceProvider) Download(ctx context.Context, im *pb.ImagePath) (resp *pb.ImageLoadResult, err error) {
	url := im.Url
	path := myconfig.ImagePath + url
	photo, err := ioutil.ReadFile(path)
	if err != nil {
		fmt.Printf("no request file")
		return nil, err
	}
	return &pb.ImageLoadResult{
		RpcCode: 200,
		Message: "success",
		Photo:   photo,
	}, nil
}

func (ims *ImageServiceProvider) Reference() string {
	return "com.skynet.dipper.commons.grpc.image.DubboImageServiceGrpc$IImageService"
}
