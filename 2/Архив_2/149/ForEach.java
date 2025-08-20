/*
Использование цикла for в стиле "for-each"
Назовите этот файл 149 ForEach.java
*/

class ForEach {
  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum = 0;
    // Применить цикл for в стиле "for-each" для отображения
    // и суммирования значений.
    for (int x : nums) {
      System.out.println("Знaчeниe: " + x);
      sum += x;
    }
    System.out.println("Cyммa: " + sum);
  }
}

/*
Результат работы программы:

Знaчeниe: 1
Знaчeниe: 2
Знaчeниe: 3
Знaчeниe: 4
Знaчeниe: 5
Знaчeниe: 6
Знaчeниe: 7
Знaчeниe: 8
Знaчeниe: 9
Знaчeниe: 10
Cyммa: 55
*/

