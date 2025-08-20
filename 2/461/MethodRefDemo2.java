
/*

 Демонстрация использования ссылки на метод экземпляра.
Нaзoвитe этoт фaйл 461 MethodRefDemo2.java
*/

// Функциональный интерфейс для операций над строками.
interface StringFunc {
  String func(String n);
}
// Теперь в этом классе определен метод экземпляра по имени strReverse().
class MyStringOps {
  String strReverse(String str) {
    String result = "";
    int i;
    for(i = str.length()-1; i >= 0; i--)
      result += str.charAt(i);
    return result;
  }
}
class MethodRefDemo2 {
  // Первый параметр этого метода имеет тип функционального интерфейса.
  // Таким образом, ему можно передавать любой экземпляр реализации
  // интерфейса StringFunc, включая ссыпку на метод.
  static String stringOp(StringFunc sf, String s) {
    return sf.func(s);
  }
  public static void main(String[] args) {
    String inStr = "Lambdas add power to Java";
    String outStr;
    // Создать объект MyStringOps.
    MyStringOps strOps = new MyStringOps();
    // Передать в stringOp() ссылку на метод экземпляра strReverse().
    outStr = stringOp(strOps::strReverse, inStr);
    System.out.println("Иcxoднaя строка : " + inStr);
    System.out.println("Cтpoкa с противоположным порядком следования символов: " +
                        outStr);
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Иcxoднaя строка : Lambdas add power to Java
Cтpoкa с противоположным порядком следования символов: avaJ ot rewop dda sadbmaL
*/

