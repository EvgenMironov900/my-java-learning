
/*
Исnользование super для nреодоления сокрытия имен
Назoвитe этoт файл 226 UseSuper.java
*/

class А {
  int i;
}
// Создать подкласс путем расширения класса А.
class B extends А {
  int i;    // этот член i скрывает i в А
  B(int a, int b) {
    super.i = a;   // i в А
    i = b;          // i в B
  }
  void show() {
    System.out.println("i в суперклассе: " + super.i);
    System.out.println("i в   подклассе: " + i);
  }
}
class UseSuper {
  public static void main (String[] args) {
    B subOb = new B(1, 2);
    subOb.show();
  }
}

/*
Рeзультат рабoты прoграммы:

i в суперклассе: 1
i в   подклассе: 2
*/




