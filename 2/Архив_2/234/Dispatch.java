/*
Динамическая диспетчеризация методов
Назoвитe этoт файл 234 Dispatch.java
*/

class A {
  void callme() {
    System.out.println("Bнyтpи метода callme() класса A");
  }
}
class B extends A {
  // Переопределить callme().
  void callme() {
    System.out.println("Bнyтpи метода callme() класса B");
  }
}
class C extends A {
  // Переопределить callme().
  void callme() {
    System.out.println("Внутри метода callme() класса C");
  }
}
class Dispatch {
  public static void main(String[] args) {
    A a = new A(); // объект типa A
    B b = new B(); // объект типa B
    C c = new C(); // объект типa C
    A r; // получить ссылку типa A
    r = a; // r ссылается на объект A
    r.callme(); // вызывается версия callme() из A
    r = b; // r ссылается на объект B
    r.callme(); // вызывается версия callme() из B
    r = c; // r ссылается на объект C
    r.callme(); // вызывается версия callme() из C
  }
}

/*
Рeзультат рабoты прoграммы:

Bнyтpи метода callme() класса A
Bнyтpи метода callme() класса B
Внутри метода callme() класса C
*/

