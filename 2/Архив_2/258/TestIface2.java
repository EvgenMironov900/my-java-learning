
/*
Еще одна реализация Callback
Назoвитe этoт файл 258 TestIface2.java
*/

interface Callback {
  void callback(int param);
}

class Client implements Callback { 
  // Реализовать метод интерфейса Callback. 
  public void callback(int р) { 
    System.out.println("callback() вызывается со значением " + р) ; 
  }
  void nonifaceMeth() { 
  System.out.println("Классы, которые реализуют интерфейсы, " + 
                      "могут также определять и другие члены.") ;
  }
}

class AnotherClient implements Callback {
  // Реализовать метод интерфейса Callback.
  public void callback(int p) {
    System.out.println("Eщё одна версия callback()");
    System.out.println("p в квадрате равно " + (p*p));
  }
}
class TestIface2 {
  public static void main(String[] args) {
    Callback c = new Client();
    AnotherClient ob = new AnotherClient();
    c.callback(42);
    c = ob;
    c.callback(42);
  }
}

/*
Рeзультат рабoты прoграммы:

callback() вызывается со значением 42
Eщё одна версия callback()
p в квадрате равно 1764
*/

