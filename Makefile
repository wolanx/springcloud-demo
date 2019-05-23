default:
	@cat Makefile

jar:
	gradle bootJar

build:
	gradle buildDocker

deploy:
	docker run -it -d -p 8761:8761 --name=base-eureka com.zx5435/base-eureka:1.0
	docker run -it -d -p 1002:1002 --name=service-news com.zx5435/service-news:1.0
	docker run -it -d -p 2001:2001 --name=view-web com.zx5435/view-web:1.0
