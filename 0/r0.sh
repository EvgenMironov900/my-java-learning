#!/bin/bash

cd ~/EE/MyJAVA/2/$1

#sleep 10
javac $2 $3.java
if [ $? = 0 ]; then
#  java $2 > Вывод.txt
#  java $2 > Вывод.txt 2> Err.txt
  java $3 $4 > Вывод.txt 2> Err.txt
  exit
else
  echo Ошибочка компиляции! 
#  set -e
  exit 1
fi

