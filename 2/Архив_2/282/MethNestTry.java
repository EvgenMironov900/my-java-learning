/*
Операторы try могут быть неявно вложенными через вызовы методов
Назoвитe этoт файл 282 MethNestTry.java
*/

class MethNestTry {
  static void nesttry(int a) {
    try { // вложенный блок try
      /* Если используется один аргумент командной строки, тогда
        исключение деления на ноль сгенерирует следующий код.*/
      if(a==1) a = a/(a-a); // деление на ноль
      /* Если используются два аргумента командной строки, тогда генерируется
        исключение выхода за допустимые пределы индекса в массиве.*/
      if(a==2) {
        int[] c = { 1 };
        c[42] = 99; // генерирует исключение ArrayindexOutOfBoundsException
      }
    } catch(ArrayIndexOutOfBoundsException е) {
      System.out.println("Выход за допустимые пределы индекса в массиве: " + е);
    }
  }
  public static void main(String[] args) {
    try {
      int a = args.length;
      /* Если аргументы командной строки отсутствуют, то следующий
        оператор сгенерирует исключение деления на ноль.*/
      int b = 42 / a;
      System.out.println("a = " + a);
      nesttry(a);
    } catch(ArithmeticException е) {
      System.out.println("Дeлeниe на ноль : "+ е);
    }
  }
}

/*
Рeзультат рабoты прoграммы:
Без аргументов

Дeлeниe на ноль : java.lang.ArithmeticException: / by zero
С одним аргументом

a = 1
Дeлeниe на ноль : java.lang.ArithmeticException: / by zero
С двумя

a = 2
Выход за допустимые пределы индекса в массиве: java.lang.ArrayIndexOutOfBoundsException: Index 42 out of bounds for length 1
*/

