#!/bin/bash
cd ~/EE/MyJAVA/0

# bash ./j0 386 CopyFile FIRST.TXT SECOND.TXT
bash ./r0.sh 607 -Xlint PBDemo
KodVyp=$?
if [ $KodVyp -ne 0 ]; then
  echo Выполнено с ошибкой
  set -e
fi

