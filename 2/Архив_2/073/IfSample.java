/*
Демонстрация работы оператора if.
Назовите этот файл 073 IfSample.java
*/
class IfSample {
 public static void main(String[] args) {
 int x, у;
  x = 10;
  у = 20;
  if(x < у) System.out.println("Знaчeниe x меньше у ");
  x = x * 2;
  if(x == у) System.out.println("Tenepь значение x равно у " );
  x = x * 2;
  if(x > у) System.out.println("Teпepь значение x больше у " );
  // Здесь ничего не отобразится
  if(x == у) System.out.println("Этoт вывод вы не увидите " );
  }
}
/*
Результат работы программы:

Знaчeниe x меньше у 
Tenepь значение x равно у 
Teпepь значение x больше у 
*/

