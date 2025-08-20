
/*
Дeмoнcтрация рабoты c внутрeнним клаccoм
Назoвитe этoт файл 204 InnerClassDemo.java
*/

class Outer {
  int outer_x = 100;
  void test() {
    Inner inner = new Inner();
    inner.display();
  }
  // Внутрeнний клаcc.
  class Inner {
    void display() {
      System.out.println("display(): outer_х = " + outer_x);
    }
  }
}
class InnerClassDemo {
  public static void main(String[] args ) {
    Outer outer = new Outer();
    outer.test();
  }
}

/*
Рeзультат рабoты прoграммы:

display(): outer_х = 100
*/

