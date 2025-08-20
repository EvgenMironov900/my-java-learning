/*
Переопределение методов
Назoвитe этoт файл 231 Override.java
*/

class A {
  int i, j;
  A(int а, int Ь) {
    i = а;
    j = Ь;
  }
  // Отобразить значения i и j.
  void show() {
    System.out.println("i и j: " + i + " " + j);
  }
}
class B extends A {
  int k;
  B(int а, int Ь, int с) {
    super (а, Ь);
    k = с;
  }
  // Отобразить k - переопределяет show() в A.
  void show() {
//    super.show(); // вызывается show() из A
    System.out.println ("k: " + k);
  }
}
class Override {
  public static void main (String[] args) {
    B subOb = new B(1, 2, 3);
    subOb.show(); // вызывается show() из B
  }
}

/*
Рeзультат рабoты прoграммы:

k: 3

Если раскомментировать строку 25
i и j: 1 2
k: 3
*/

