
/*

 Демонстрация использования лямбда-выражения, принимающего параметр.
Нaзoвитe этoт фaйл 448_2 LambdaDemo2.java
*/

// Еще один функциональный интерфейс.
interface NumericTest {
  boolean test(int n);
}
class LambdaDemo2 {
  public static void main(String[] args) {
    // Лямбда-выражение, которое проверяет, четное ли число.
    NumericTest isEven =(n) ->(n % 2)==0;
    if(isEven.test(10)) System.out.println("10 -- четное число");
    if(!isEven.test(9)) System.out.println("9 -- нечетное число");
    // Лямбда-выражение, которое проверяет, является ли
    // число неотрицательным.
    NumericTest isNonNeg =(n) -> n >= 0;
    if(isNonNeg.test(1)) System.out.println("1 -- неотрицательное число");
    if(! isNonNeg.test(-1)) System.out.println("-1 -- отрицательное число");
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

10 -- четное число
9 -- нечетное число
1 -- неотрицательное число
-1 -- отрицательное число
*/

