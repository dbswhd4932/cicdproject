#!/usr/bin/env bash

REPOSITORY=/home/ubuntu/cicdproject/build/libs
cd $REPOSITORY

APP_NAME=greenstep
JAR_NAME=$(ls $REPOSITORY | grep 'cicdproject-0.0.1-SNAPSHOT.jar' | tail -n 1)
echo "$JAR_NAME"
JAR_PATH=$REPOSITORY/$JAR_NAME
echo "$JAR_PATH"

CURRENT_PID=$(pgrep -f $APP_NAME)

if [ -z $CURRENT_PID ]
then
  echo "> 종료할것 없음."
else
  echo "> kill -9 $CURRENT_PID"
  kill -15 $CURRENT_PID
  sleep 5
fi

echo "> $JAR_PATH deploy"
nohup java -jar $JAR_PATH > /dev/null 2> /dev/null < /dev/null &