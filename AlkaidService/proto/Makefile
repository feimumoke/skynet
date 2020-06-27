
protoc -I ./ BaseService.proto  --dubbo_out=plugins=grpc+dubbo:../protorpc/base
protoc -I ./ Blog*.proto  --dubbo_out=plugins=grpc+dubbo:../protorpc/blog

protoc -I ./ ImageService.proto --go_out=plugins=grpc:../protorpc/image
protoc -I ./ ImageService.proto  --dubbo_out=plugins=grpc+dubbo:../protorpc/image
