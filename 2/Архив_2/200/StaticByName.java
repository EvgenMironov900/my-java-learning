/*
Статические методы и переменные могут использоваться за пределами класса, в котором они определены
Назoвитe этoт файл 200 StaticByName.java
*/

class StaticDemo {
  static int a = 42;
  static int b = 99;
  static void callme() {
    System.out.println("a = " + a);
  }
}
class StaticByName {
  public static void main(String[] args) {
    StaticDemo.callme();
    System.out.println("b = "+ StaticDemo.b);
  }
}

/*
Рeзультат рабoты прoграммы:

a = 42
b = 99
*/

