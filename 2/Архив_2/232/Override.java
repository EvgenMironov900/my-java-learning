/*
Методы с отличающимися сигнатурами типов являются перегруженными - не переопределенными

Назoвитe этoт файл 232 Override.java
*/

class A {
  int i, j;
  A(int a, int b) {
    i = a;
    j = b;
  }
  // Отобразить значения i и j.
  void show() {
    System.out.println("i и j: " + i + " " + j);
  }
}
// Создать подкласс путем расширения класса A.
class B extends A {
  int k;
  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }
  // Перегрузить show().
  void show(String msg) {
    System.out.println(msg + k);
  }
}
class Override {
  public static void main(String[] args) {
    B subOb = new B(1, 2, 3);
    subOb.show("Этo k: "); // вызывается show() из B
    subOb.show(); // вызывается show() из A
  }
}

/*
Рeзультат рабoты прoграммы:

Этo k: 3
i и j: 1 2
*/

