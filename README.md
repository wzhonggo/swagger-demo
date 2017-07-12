# swagger-demo
Restful api doc with Swagger UI

# Lib
* Spring Boot 1.5.4
* Spring Fox 2.6.1
* Swagger UI 3.0.18

# 
* 启动Spring Boot后, 端口默认在8080
* 访问[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) 可以看到 SpringFox根据 Swagger model生成的UI
* 访问[http://localhost:8080/v2/api-docs](http://localhost:8080/v2/api-docs)可以看到swagger.json
* 在src/main/resources/static/dist是从[Swagger UI](https://github.com/swagger-api/swagger-ui)dist目录copy过来的，访问[http://localhost:8080/dist/index.html](http://localhost:8080/dist/index.html)
会看到Swagger UI默认从[http://petstore.swagger.io/v2/swagger.json](http://petstore.swagger.io/v2/swagger.json)拉过来的api文档, 把 http://petstore.swagger.io/v2/swagger.json 换成
http://localhost:8080/v2/api-docs ,点击Explor按钮，会看到根据当前项目生成api文档

