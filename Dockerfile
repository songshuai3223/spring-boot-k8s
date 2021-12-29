FROM registry.dg.com/dpd-dsm/d3base:2.0.0
COPY target/spring-boot-k8s.jar  /app/spring-boot-k8s.jar
COPY entrypoint.sh /app/entrypoint.sh
WORKDIR /app
ENTRYPOINT [ "/app/entrypoint.sh"]