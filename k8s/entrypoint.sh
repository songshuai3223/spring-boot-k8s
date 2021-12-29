#! /bin/sh


OPTS="-Dloader.path=./conf -Xms1g -Xmx1g   -XX:MetaspaceSize=500m -XX:MaxMetaspaceSize=500m -XX:+UseParallelOldGC -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -Xloggc:/logs/gc/gc.log"
exec nohup java  $OPTS -XX:+ExitOnOutOfMemoryError  -jar  /app/spring-boot-k8s.jar  > /dev/null 2>&1