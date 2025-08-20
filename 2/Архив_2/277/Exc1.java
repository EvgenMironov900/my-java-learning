/*
Исключение вызывается в подпрограмме
Назoвитe этoт файл 277 Exc1.java
*/

class Exc1 {
  static void subroutine() {
    int d = 0;
    int а = 10 / d;
  }
  public static void main(String[] args) {
    Exc1.subroutine();
  }
}

/*
Рeзультат рабoты прoграммы:

Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exc1.subroutine(Exc1.java:9)
	at Exc1.main(Exc1.java:12)
*/

