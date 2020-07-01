
## dipper的分布式版本
---
## 总体基于google提供的GRPC框架实现不同语言之间的交互，使用Duboo实现服务治理。  
### Grpc-Java：   
  后台：基于springboot、mybatis，grpc，netty，redis等实现用户和qq消息的管理  
  前台：目前实现登录和QQ单聊，聊天基于layim。  
### Grpc-Golang：  
  提供后台服务：提供博客相关功能，提供图片服务器功能。  

## 启动顺序：  
  先启动 Provider和AlkaidService提供服务，再启动Consumer。
## 效果图如下：
  
![效果图]( /screen/1.png)

![效果图]( /screen/2.png)

![效果图]( /screen/3.png)

![效果图]( /screen/4.png)

![效果图]( /screen/5.png)


# TODO
  客户端版本 

