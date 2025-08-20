/*
Один интерфейс может расширять другой
Назoвитe этoт файл 265 IFExtend.java
*/

interface А {
  void meth1();
  void meth2();
}
// Интерфейс В теперь включает meth1() и meth2() - он добавляет methЗ().
interface В extends А {
  void methЗ();
}
// Этот класс должен реализовать все методы интерфейсов А и В.
class MyClass implements В {
  public void meth1() {
    System.out.println("Peaлизaция meth1().");
  }
  public void meth2() {
    System.out.println("Peaлизaция meth2().");
  }
  public void methЗ() {
    System.out.println("Peaлизaция methЗ().");
  }
}
class IFExtend {
  public static void main(String[] args) {
    MyClass ob = new MyClass();
    ob.meth1();
    ob.meth2();
    ob.methЗ();
  }
}

/*
Рeзультат рабoты прoграммы:

Peaлизaция meth1().
Peaлизaция meth2().
Peaлизaция methЗ().
*/

