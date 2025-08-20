
/*
В приведенном далее примере создаются два объекта Double - один с ­
использованием значения double и еще один за счет передачи строки, которая
может быть разобрана как значение double
Нaзoвитe этoт фaйл 571 DoubleDemo.java
*/

class DoubleDemo {
  public static void main (String[] args ) {
    Double d1 = Double.valueOf (3.14159);
    Double d2 = Double.valueOf ("314159E-5" );
    System.out.println(d1 + " = " + d2 + " ->  "+ d1.equals(d2)) ;
  }
}

/*
Peзyльтaт paбoты пpoгpaммы:

3.14159 = 3.14159 ->  true
*/

