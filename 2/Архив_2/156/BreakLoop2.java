/*
 Использование break для выхода из цикла while 
Назовите этот файл 156 BreakLoop2.java
*/

class BreakLoop2 { 
  public static void main(String[] args) {
    int i = 0;
    while (i < 100) {
      if (i == 10) break; // прекратить выполнение цикла, если i равно 10
      System.out.println("i: "+ i);
      i++;
    }
    System.out.println("Цикл завершен.");
  }
}

/*
Результат работы программы:
i: 0
i: 1
i: 2
i: 3
i: 4
i: 5
i: 6
i: 7
i: 8
i: 9
Цикл завершен.
*/








