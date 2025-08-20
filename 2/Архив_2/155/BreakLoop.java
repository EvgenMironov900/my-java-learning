/*
 Использование break для выхода из цикла
Назовите этот файл 155 BreakLoop.java
*/

class BreakLoop { 
  public static void main(String[] args) { 
    for (int i=0 ; i<100; i++) { 
      if(i==10) break; // прекратить выполнение цикла, если i равно 10
      System.out.println("i: " + i);
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

