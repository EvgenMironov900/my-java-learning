#!/bin/bash
#cd ~/EE/MyJAVA/0
cd ~/EE/Win_MyJAVA/0

# bash ./j0 386 CopyFile FIRST.TXT SECOND.TXT

bash ./j0 835 BufferedInputStreamDemo
KodVyp=$?
if [ $KodVyp -ne 0 ]; then
  echo Выполнено с ошибкой
  set -e
fi

