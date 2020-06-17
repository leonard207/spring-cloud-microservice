# spring-cloud-microservice  [![Build Status](https://travis-ci.org/leonard207/spring-cloud-microservice.svg?branch=master)](https://travis-ci.org/leonard207/spring-cloud-microservice) [![Gitter](https://badges.gitter.im/leonard207/spring-cloud-microservice.svg)](https://gitter.im/leonard207/spring-cloud-microservice?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)

[![Join the chat at https://gitter.im/leonard207/spring-cloud-microservice](https://badges.gitter.im/leonard207/spring-cloud-microservice.svg)](https://gitter.im/leonard207/spring-cloud-microservice?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

## 项目说明

这是一个微服务项目例子，使用spring-cloud搭建的工程基础环境.

## 开发环境

* Java 1.8
* Maven 3.x

### 项目模块介绍

Module            | Description
------------------|--------------
config-service    | 中心配置服务
discovery-service | 服务注册发现中心
edge-service      | 服务网关
bookstore         | 微服务提供者
reading           | 微服务消费者
hystrix-dashboard | 服务容错控制台 
turbine           | 容错数据聚合


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