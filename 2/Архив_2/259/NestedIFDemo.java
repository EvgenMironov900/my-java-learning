
/*
// Пример вложенного интерфейса.
Назoвитe этoт файл  259 NestedIFDemo.java
*/


// Класс А содержит член-интерфейс.
class А {
  // Вложенный интерфейс.
  public interface NestedIF {
    boolean isNotNegative(int х);
  }
}
// Класс В реализует вложенный интерфейс.
class В implements А.NestedIF {
  public boolean isNotNegative(int х) {
    return х<0? false : true;
  }
}
class NestedIFDemo {
  public static void main(String[] args) {
    // Использовать ссылку на вложенный интерфейс.
    А.NestedIF nif = new В();
    if(nif.isNotNegative(10))
     System.out.println("10 не является отрицательным");
    if(nif.isNotNegative(-12))
      System.out.println("Это выводиться не будет");
  }
}

/*
Рeзультат рабoты прoграммы:

10 не является отрицательным
*/

