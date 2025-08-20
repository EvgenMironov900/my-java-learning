
/*

 Использование ссылки на метод при поиске максимального значения в коллекции.
Нaзoвитe этoт фaйл 466 UseMethodRef.java
*/

import java.util.*;
class MyClass {
  private int val;
  MyClass(int v) { val = v; }
  int getVal() { return val; }
}
class UseMethodRef {
  // Метод compareMC(), совместимый с методом compare(),
  // который определен в Comparator<T>.
  static int compareMC(MyClass a, MyClass b) {
    return a.getVal() - b.getVal();
  }
  public static void main(String[] args) {
    ArrayList<MyClass> a1 = new ArrayList<MyClass>();
    a1.add(new MyClass(1));
    a1.add(new MyClass(4));
    a1.add(new MyClass(2));
    a1.add(new MyClass(9));
    a1.add(new MyClass(3));
    a1.add(new MyClass(7));
    // Найти максимальное значение в al, используя метод compareMC().
    MyClass maxValObj = Collections.max(a1, UseMethodRef::compareMC);
    System.out.println("Максимальное значение равно: " + maxValObj.getVal());
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Максимальное значение равно: 9
*/

