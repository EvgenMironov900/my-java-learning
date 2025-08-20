/*
Использование цикла for в стиле "for-each" для прохода по двумерному массиву
Назовите этот файл 151 ForEachЗ.java
*/

class ForEachЗ {
  public static void main(String[] args) {
    int sum = 0;
    int [][] nums = new int[3][5];
    // Сохранить в nums ряд значений .
    for (int i=0; i<3; i++)
      for (int j=0; j<5; j++)
        nums[i][j] = (i+1)*(j+1);
    // Применить цикл for в стиле "for-each" для отображения
    // и суммирования значений.
    for (int[] x : nums) {
      for (int y : x) {
        System.out.println("Знaчeниe: " + y);
        sum += y;
      }
    }
    System.out.println("Сумма: " + sum ) ;
  }
}

/*
Результат работы программы:
Знaчeниe: 1
Знaчeниe: 2
Знaчeниe: 3
Знaчeниe: 4
Знaчeниe: 5
Знaчeниe: 2
Знaчeниe: 4
Знaчeниe: 6
Знaчeниe: 8
Знaчeниe: 10
Знaчeниe: 3
Знaчeниe: 6
Знaчeниe: 9
Знaчeниe: 12
Знaчeниe: 15
Сумма: 90
*/

