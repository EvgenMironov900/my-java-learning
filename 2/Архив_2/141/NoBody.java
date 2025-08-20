/*
Тело цикла может быть пустым
Назовите этот файл 141 NoBody.java
*/

class NoBody {
  public static void main(String[] args) {
  int i, j;
  i = 100;
  j = 200;
  // найти среднюю точку между i и j
  while(++i<--j); // тело в цикле отсутствует
  System.out.println("Cpeдняя точка равна " + i ) ;
  }
}

/*
Результат работы программы:
Cpeдняя точка равна 150
*/

