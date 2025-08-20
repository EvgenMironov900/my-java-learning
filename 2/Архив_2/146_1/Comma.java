/*
Использование запятой
Назовите этот файл 146_1 Comma.java
*/

class Comma {
  public static void main(String[] args) {
    int a, b;
    for (a=1, b=4; a<b; a++ ,b--) {
      System.out.println("a = " + a);
      System.out.println("b = " + b);
    }
  }
}

/*
Результат работы программы:
a = 1
b = 4
a = 2
b = 3
*/

