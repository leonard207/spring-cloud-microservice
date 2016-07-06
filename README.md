# spring-cloud-microservice  [![Build Status](https://travis-ci.org/leonard207/spring-cloud-microservice.svg?branch=master)](https://travis-ci.org/leonard207/spring-cloud-microservice)

## 项目说明

这是一个微服务项目例子，使用spring-cloud搭建的工程基础环境.

## 开发环境

* Java 1.8
* Gradle 2.x

### spring-cloud组件

Component         | Description
------------------|--------------
config            | 中心配置服务
eureka            | 服务注册发现中心
zuul              | 服务网关
ribbon            | 客户端负载均衡调用
hystrix           | 服务容错
hystrix-amqp      | 异步提交容错数据
hystrix-dashboard | 服务容错控制台
turbine           | 容错数据聚合