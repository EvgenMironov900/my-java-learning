#!/bin/bash

# Удалим всё ненужное
git rm --cached *.jar
git rm --cached *.class
git rm --cached target/ -r  # если есть
git rm --cached *.zip
git rm --cached *.tar.gz

# Добавим .gitignore чтобы это больше не попадало
echo "*.jar" >> .gitignore
echo "*.class" >> .gitignore  
echo "target/" >> .gitignore
echo "bin/" >> .gitignore
echo "*.zip" >> .gitignore
echo "*.tar.gz" >> .gitignore

