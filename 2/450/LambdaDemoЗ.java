
/*

 Демонстрация использования лямбда-выражения, принимающего два параметра.
Нaзoвитe этoт фaйл 450 LambdaDemoЗ.java
*/

interface NumericTest2 {
  boolean test(int n, int d);
}
class LambdaDemoЗ {
  public static void main(String[] args) {
  // Это лямбда-выражение выясняет, является ли одно число
  // множителем другого.
  NumericTest2 isFactor = (n, d) -> (n % d) == 0;
  if(isFactor.test(10, 2))
    System.out.println("2 является множителем 10");
  if(!isFactor.test(10, 3))
    System.out.println("З не является множителем 10");
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

2 является множителем 10
З не является множителем 10
*/

