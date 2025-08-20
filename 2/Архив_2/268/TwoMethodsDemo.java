/*
Для реализующего класса возможно и распространено определение соб­ственной реализации стандартного метода
Назoвитe этoт файл 268 TwoMethodsDemo.java
*/

class MyIFimp2 implements MyIF {
  // Здесь предоставляются реализации для обоих методов, getNumber()
  // и getString().
  public int getNumber() {
    return 100;
  }
  public String getString() {
    return "Другая строка. " ;
}
}
class TwoMethodsDemo {
  public static void main(String[] args) {
    MyIFimp2 obj = new MyIFimp2();
    // Метод getNumber() можно вызывать, потому что
    // он явно реализован в MyIFimp2 :
    System.out.println(obj.getNumber());
/*
  // Метод getString() тоже можно вызывать
  // из-за наличия стандартной реализации
*/
    System.out.println(obj.getString());
  }
}

/*
Рeзультат рабoты прoграммы:

100
Другая строка. 
*/

