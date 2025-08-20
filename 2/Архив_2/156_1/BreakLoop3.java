/*
 Использование break с вложенными циклами
Назовите этот файл 156_1 BreakLoop3.java
*/

class BreakLoop3 { 
  public static void main(String[] args) {
    for (int i=0; i<3; i++) { 
      System.out.print("Пpoxoд " + i + ": "); 
      for ( int j=0; j<100; j++) { 
        if (j == 10) break; // прекратить выполнение цикла, если j равно 10 
        System.out.print(j +" ") ;
        }
      System.out.println() ;
    }
    System.out.println("Цикл завершен." ) ;
  }
}

/*
Результат работы программы:
Пpoxoд 0: 0 1 2 3 4 5 6 7 8 9 
Пpoxoд 1: 0 1 2 3 4 5 6 7 8 9 
Пpoxoд 2: 0 1 2 3 4 5 6 7 8 9 
Цикл завершен.
*/






