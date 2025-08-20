/*
Использование стандартного метода
Назoвитe этoт файл 267 DefaultMethodDemo.java
*/

// Реализовать MyIF.
class MyIFimp implements MyIF {
  // Необходимо реализовать только метод getNumber() , определенный в MyIF.
  // Для метода getString() разрешено применять стандартную реализацию.
  public int getNumber() {
    return 100;
  }
}
// Использовать стандартный метод.
class DefaultMethodDemo {
  public static void main(String[] args) {
    MyIFimp obj = new MyIFimp();
    // Метод getNumber() можно вызывать, потому что
    // он явно реализован в MyIFimp :
    System.out.println(obj.getNumber());
    // Метод getString() тоже можно вызывать
    // из-за наличия стандартной реализации :
    System.out.println(obj.getString());
  }
}

/*
Рeзультат рабoты прoграммы:

100
Стандартная строка
*/

