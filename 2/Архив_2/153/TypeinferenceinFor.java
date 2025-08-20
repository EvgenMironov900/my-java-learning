/*
Использование выведения типов локальных переменных в цикле for
Назовите этот файл 153 TypeinferenceinFor.java
*/

class TypeinferenceinFor {
  public static void main(String[] args) {
    // Применить выведение типов к переменной управления циклом.
    System.out.print("Знaчeния x: ");
    for (var x = 2.5; x<100.0; x = x*2)
      System.out.print(x + " ");
    System.out.println();
    // Применить выведение типов к переменной итерации.
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    System.out.print("Знaчeния в массиве nums: ");
    for (var v : nums)
      System.out.print(v + " ");
    System.out.println();
  }
}

/*
Результат работы программы:

*/

