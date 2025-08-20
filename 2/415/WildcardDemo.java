
/*

 Использование подстановочного знака.
Нaзoвитe этoт фaйл 415 WildcardDemo.java
*/




class Stats<T extends Number> {
  T[] nums; // массив элементов класса Number или его подкласса
  // Передать конструктору ссьmку на массив элементов
  // класса NumЬer или его подкласса.
  Stats(T[] о) {
    nums = о;
  }
  // Во всех случаях возвращать результат типа double.
  double average() {
    double sum = 0.0;
    for(int i=0; i < nums.length; i++)
      sum += nums[i].doubleValue();
    return sum / nums.length;
  }
  // Выяснить, одинаковы ли два средних значения.
  // Обратите внимание на использование подстановочного знака.
  boolean isSameAvg(Stats<?> оЬ) {
    if(average() == оЬ.average())
      return true;
    return false;
  }
}
// Демонстрация применения подстановочного знака.
  class WildcardDemo {
    public static void main(String[] args) {
    Integer[] inums = { 1, 2, 3, 4, 5};
    Stats<Integer> iob = new Stats<Integer>(inums);
    double v = iob.average();
    System.out.println("Cpeднee значение iob равно " + v);
    Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
    Stats<Double> dob = new Stats<Double>(dnums);
    double w = dob.average();
    System.out.println("Cpeднee значение dob равно " + w);
    Float[] fnums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
    Stats<Float> fob = new Stats<Float>(fnums);
    double x = fob.average();
    System.out.println("Cpeднee значение fob равно " + x);
    // Выяснить, какие массивы имеют одинаковые средние значения.
    System.out.print("Средние значения iob и dob ");
    if(iob.isSameAvg(dob))
      System.out.println("oдинaкoвы.");
    else
      System.out.println("oтличaютcя.");
    System.out.print("Cpeдниe значения iob и fob");
    if(iob.isSameAvg(fob))
      System.out.println("oдинaкoвы.");
    else
      System.out.println("oтличaютcя.");
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Cpeднee значение iob равно 3.0
Cpeднee значение dob равно 3.3
Cpeднee значение fob равно 3.0
Средние значения iob и dob oтличaютcя.
Cpeдниe значения iob и foboдинaкoвы.
*/

