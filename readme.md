# SpringBoot作为war项目发布

1. 代码App.java增加SpringBootServletInitializer的实现类。

2. pom.xml中设定spring-boot-starter-tomcat的scope为provided。

3. pom.xml中设定\<packaging\>war\</packaging\>。

>注意: 这种项目仅仅部署到Web容器是有效的，无法从本地用mvn:tomcat来运行查看效果。如果需要本地运行调试需要恢复2,3步后，以Springboot方式运行。