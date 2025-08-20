/*
Простой пример наследования
Назoвитe этoт файл 217 Simpleinheritance.java
*/
// Создать суперкласс
class А {
  int i, j;
  void showij() {
    System.out.println("i и j: " + i + " " + j);
  }
}
// Создать подкласс путем расширения класса А.
class В extends А {
  int k;
  void showk() {
    System.out.println(" k: " + k);
  }
  void sum() {
    System.out.println("i + j + k: " + (i + j + k));
  }
}
class Simpleinheritance {
  public static void main(String[] args) {
    А superOb = new А();
    В subOb = new В();
    // Суперкласс можно использовать сам по себе .
    superOb.i = 10;
    superOb.j = 20;
    System.out.println("Coдepжимoe superOb: ");
    superOb. showij ();
    System.out.println();
/* Подкласс имеет доступ ко всем открытым членам своего суперкласса. */
    subOb.i = 7;
    subOb.j = 8;
    subOb.k = 9;
    System.out.println( "Coдepжимoe subOb: ");
    subOb.showij ();
    subOb.showk();
    System.out.println();
    System.out.println("Сумма i, j и k в subOb: ");
    subOb.sum();
  }
}

/*
Рeзультат рабoты прoграммы:

Coдepжимoe superOb: 
i и j: 10 20

Coдepжимoe subOb: 
i и j: 7 8
 k: 9

Сумма i, j и k в subOb: 
i + j + k: 24
*/

