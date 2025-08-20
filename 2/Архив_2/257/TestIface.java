
/*
Метод callback() вызывается через переменную ссылки на интерфейс
Назoвитe этoт файл 257 TestIface.java
*/

interface Callback { 
  void callback (int param);
}
class Client implements Callback { 
  // Реализовать метод интерфейса Callback. 
  public void callback(int р) { 
    System.out.println("callback () вызывается со значением " + р) ; 
  }
  void nonifaceMeth() { 
  System.out.println( "Классы, которые реализуют интерфейсы, " + 
                      "могут также определять и другие члены.") ;
  }
}
class TestIface { 
  public static void main(String[] args) { 
    Callback c = new Client(); 
    c.callback (42) ;
  }
}

/*
Рeзультат рабoты прoграммы:

callback () вызывается со значением 42
*/

