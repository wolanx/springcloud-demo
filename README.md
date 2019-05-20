# springcloud-demo
做个稀饭

```
gradle 依赖管理，比maven更少更干净，参考各个父子项目的build.gradle

```

gradle base-eureka:bootJar --info
java -jar base-eureka/build/libs/base-eureka-1.0.jar

gradle base-eureka:runDocker --info

docker run -it -d -p 8761:8761 --name=base-eureka com.zx5435/base-eureka:1.0
