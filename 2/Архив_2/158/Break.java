/*
Использование break в качестве "цивилизованной" формы перехода в стиле "goto" 
Назовите этот файл 158 Break.java
*/

class Break { 
  public static void main(String[] args) {
    boolean t = true;
    first: {
      secoпd: {
        third: {
          System.out.println ( "Пepeд оператором break.");
          if (t) break secoпd; // выйти из блока second
          System.out.println ("Этoт оператор не выполнится.");
        }
        System.out.println ("Этoт оператор не выполнится.");
      }
      System.out.println ("После блока second.");
    }
  }
}

/*
Результат работы программы:
Пepeд оператором break.
После блока second.
*/

