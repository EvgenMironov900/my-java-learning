/*
Простая демонстрация применения abstract
Назoвитe этoт файл 238 AbstractDemo.java
*/

abstract class A {
  abstract void callme();
  // Конкретные методы в абстрактных классах по-прежнему разрешены.
  void callmetoo() {
    System.out.println("Этo конкретный метод в абстрактном классе A.");
  }
}
class B extends A {
  void callme() {
    System.out.println("Peaлизaция callme() в классе B.");
  }
}
class AbstractDemo {
  public static void main(String[] args) {
    B b = new B();
    b.callme();
    b.callmetoo();
  }
}

/*
Рeзультат рабoты прoграммы:

Peaлизaция callme() в классе B.
Этo конкретный метод в абстрактном классе A.
*/

