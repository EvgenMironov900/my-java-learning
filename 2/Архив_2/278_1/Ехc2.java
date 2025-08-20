/*
В программе определен блок try и конструкция catch, обрабатывающая исключение ArithmeticException
Назoвитe этoт файл 278_1 Ехc2.java
*/

class Ехc2 {
  public static void main(String[] args) {
    int d, а;
    try { // отслеживать блок кода
      d = 0;
      а = 42 / d;
      System.out.println("Этo выводиться не будет.");
      } catch(ArithmeticException е) { // перехватить ошибку деления на ноль
        System.out.println("Дeлeниe на ноль.");
      }
    System.out.println("После оператора catch.");
  }
}

/*
Рeзультат рабoты прoграммы:

Дeлeниe на ноль.
После оператора catch.
*/

