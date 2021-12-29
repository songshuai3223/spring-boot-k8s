#! /bin/sh

OPTS="-Dloader.path=./conf -Xms1g -Xmx1g -XX:MetaspaceSize=120m -XX:MaxMetaspaceSize=120m -XX:+UseParallelOldGC -XX:+PrintGCDateStamps -XX:+PrintGCDetails  -Xloggc:/logs/gc.log"
exec nohup java  $OPTS -XX:+ExitOnOutOfMemoryError  -jar  /app/spring-boot-k8s.jar  > /dev/null 2>&1