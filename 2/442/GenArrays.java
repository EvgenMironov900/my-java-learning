
/*

 Обобщения и массивы.
Нaзoвитe этoт фaйл 442 GenArrays.java
*/



class Gen<T extends Number> {
  T оb;
  T[] vals; // нормально
  Gen(T о, T[] nums) {
    оb = о;
    // Этот оператор недопустим.
    // vals = new T[10]; // невозможно создать массив элементов тиnа T
    // Но следующий оператор законен.
    vals = nums; // присваивать ссьmку на существующий массив разрешено
  }
}
class GenArrays {
  public static void main(String[] args) {
    Integer[] n= { 1, 2, 3, 4, 5 };
    Gen<Integer> iOb = new Gen<Integer>(50, n);
    // Невозможно создать массив обобщенных ссыпок для конкретного типа.
    // Gen<Integer>[] gens = new Gen<Integer>[10]; // Ошибка !
    // Все нормально.
    Gen<?>[] gens = new Gen<?>[10];
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:


*/

