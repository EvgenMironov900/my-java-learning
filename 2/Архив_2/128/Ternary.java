/*
Демонстрация работы операции ?
Назовите этот файл 128 Ternary.java
*/
class Ternary {
  public static void main(String[] args) {
    int i, k;
    i = 10;
    k = i < 0 ? -i : i; // получить абсолютную величину i
    System.out.print("Aбcoлютнaя величина ");
    System.out.println(i + " равна " + k ) ;
    i = -10;
    k = i < 0 ? - i : i ; // получить абсолютную величину i
    System.out.print("Aбcoлютнaя величина ");
    System.out.println(i + " равна " + k ) ;
  }
}

/*
Результат работы программы:
Aбcoлютнaя величина 10 равна 10
Aбcoлютнaя величина -10 равна 10
*/

