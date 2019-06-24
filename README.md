# springcloud-demo
做个稀饭

## install

1. gradle bootJar --info
2. java -jar base-eureka/build/libs/base-eureka-1.0.jar
3. jpa

## 技术栈
 - gradle 依赖管理，比maven更少更干净，参考各个父子项目的build.gradle


```sh
gradle base-eureka:runDocker --info

docker run -it -d -p 8761:8761 --name=base-eureka com.zx5435/base-eureka:1.0

pm2 start pm2.json
```

## bao
 - fastjson
 - md5 commons-codec
 - guava 工具包
 - ArrayUtils CollectionUtils org.apache.commons.lang3
