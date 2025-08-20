/*
Демонстрация времени жизни переменной
Назовите этот файл 094 LifeTime.java
*/

class LifeTime {
  public static void main(String[] args) {
  int x ;
  for (x = 0; x < 3; x++) {
    int y = -1 ; // переменная y инициализируется при каждом входе в блок
    System.out.println("Знaчeниe y равно " + y); // всегда выводится -1
    y = 100;
    System.out.println("Teпepь значение y равно " + y);
    }
  }
}

/*
Результат работы программы:

Знaчeниe y равно -1
Teпepь значение y равно 100
Знaчeниe y равно -1
Teпepь значение y равно 100
Знaчeниe y равно -1
Teпepь значение y равно 100

*/

