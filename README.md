# springcloud-demo
做个稀饭

# 技术栈
## base
 - gradle 依赖管理，比maven更少更干净，参考各个父子项目的build.gradle
 - eureka 用于 微服务 上下游承接
 - springboot 基础web
 - mybatis & jpa db操作
 - thymeleaf 模版 支持layout，能独立html运行
## 工具
 - fastjson
 - md5 commons-codec
 - guava 工具包
 - ArrayUtils CollectionUtils org.apache.commons.lang3

## install

# start
## 1 eureka
```sh
gradle base-eureka:runDocker --info
# docker run -it -d -p 8761:8761 --name=base-eureka com.zx5435/base-eureka:1.0
pm2 start pm2.json
```
## 2 service
## 3 view
