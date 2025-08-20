/*
Использование break для выхода из вложенных циклов
Назовите этот файл 158_1 BreakLoop4.java
*/

class BreakLoop4 { 
  public static void main(String[] args) {
    outer: for (int i=0; i<3 ; i++) {
      System.out.print("Пpoxoд " + i + ": ");
      for (int j=0; j<100; j++) {
        if (j == 10) break outer; // выйти из обоих циклов
        System.out.print(j + " ");
      }
      System.out.println("Этo выводиться не будет.");
    }
    System.out.println("Циклы завершены.");
  }
}

/*
Результат работы программы:
Пpoxoд 0: 0 1 2 3 4 5 6 7 8 9 Циклы завершены.
*/





