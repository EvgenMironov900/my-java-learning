/*
Переменная итерации цикла for в стиле "for-each" доступна только для чтения
Назовите этот файл 151_1 NoChange.java
*/

class NoChange {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int x : nums) {
      System.out.print(x + " ");
      x = x * 10; // не влияет на nums
    }
    System.out.println();
    for (int x : nums)
      System.out.print(x + " ");
    System.out.println();
  }
}

/*
Результат работы программы:
1 2 3 4 5 6 7 8 9 10 
1 2 3 4 5 6 7 8 9 10 
*/

