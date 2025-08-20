/*
Повышение каждо­го значения в выражении для соответствия типу второго операнда в
каждой двоичной операции.

Назовите этот файл 098 Promote.java
*/

class Promote {
  public static void main(String[] args) {
  byte Ь = 42 ;
  char с = 'а';
  short s = 1024;
  int i = 50000;
  float f = 5.67f;
  double d = .1234;
  double result = (f * Ь) + (i / с) - (d * s);
  System.out.println("(f * Ь) + " + "(i / с) - " + "(d * s)");
  System.out.println("result = " + result) ;
  }
}

/*
Результат работы программы:

(f * Ь) + (i / с) - (d * s)
result = 157.7784146484375


*/

