FROM openjdk:8-jdk-alpine
# 对应pom.xml文件中的dockerfile-maven-plugin插件buildArgs配置项JAR_FILE的值
ARG JAR_FILE
# 复制打包完成后的jar文件到/opt目录下
COPY ${JAR_FILE} /docker/app.jar
# 启动容器时执行
CMD sh /docker/docker-demo.sh
# 使用端口
EXPOSE 7779