<span style="color: red">  java_firefly 开发脚手架 </span>

# 基于springboot2，适合新手学习，简单，清爽

## 功能特点

#### 前端基于layui,juicer前端模板引擎。

Layui: https://www.layui.com/demo/

juicer: https://github.com/PaulGuo/Juicer

#### 后端基于springboot + gradle + kotlin 开发。

#### MVC 设计模式,快速入门,方便上手。


#### freemaker 模板引擎

springboot 版本升级后，默认suffix为.ftlh，以前版本是.ftl，所要注意配置

freemarker.suffix: .ftl



## 二次开发 & 技术交流

#### 扫码备注: 'firefly',

![avatar](/src/main/resources/static/img/qr.jpg)

## 环境要求

Mysql: 5.6+

## 目录说明

#### /resource 用于系统默认的配置文件

#### /resource/mybatis 用于mybatis

#### /resource/static 用于存储前端css/js/img

#### /resource/templates 模板文件


## 界面载图

#### 登录界面

![avatar](/src/main/resources/static/img/login.png)

#### 后台管理

![avatar](/src/main/resources/static/img/home.png)

## 使用说明

#### 下载代码

```bash
git clone https://github.com/wzhsh90/java_firefly.git
cd java_firefly
```

#### 示例sql数据表

```sql
CREATE TABLE `sys_company_t`
(
    `id`       char(24) NOT NULL,
    `com_name` varchar(100) DEFAULT NULL,
    `com_desc` varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


```

#### 运行程序

```bash
默认运行开发模式
java #生产模式: gradle bootJar -Dprofile=product
```

                  
#### rust 开发脚手架
rust 版本： git clone https://github.com/wzhsh90/rust_firefly.git
                  
#### golang 开发脚手架
golang 版本： git clone https://github.com/wzhsh90/go_firefly.git


#### 最后，此java版本里面只是简单搭建业务逻辑，没有像rust与go 把所有代码都写完，java开发是3种语言中最简单，它的操作是固定，最灵活的是golang , 最难的是rust ，学习语言成本比较大
