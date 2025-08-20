/*
В последовательности конструкций catch подкласс должен
предшествовать своему суперклассу.В противном случае будет создан недостижимый код, что приведет к ошибке на этапе компиляции.
Эта программа содержит ошибку
Назoвитe этoт файл 280 SuperSubCatch.java
*/

/* Эта программа содержит ошибку.
*/

class SuperSubCatch {
  public static void main(String[] args) {
    try {
      int а = 0;
      int b = 42 / а;
    } catch(Exception е) {
      System.out.println("Перехват обобщенного исключения Exception.");
    }
    /* Эта конструкция catch недостижима, потому что
      ArithmeticException является подклассом Exception.*/
    catch(ArithmeticException е) { // ОШИБКА - недостижимый код
      System.out.println("Этo никогда не будет достигнуто.");
    }
  }
}

/*
Рeзультат рабoты прoграммы:

SuperSubCatch.java:21: error: exception ArithmeticException has already been caught
    catch(ArithmeticException е) { // ОШИБКА - недостижимый код
    ^
1 error

*/

