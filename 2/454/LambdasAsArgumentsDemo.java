
/*

 Использование лямбда-выражений в качестве аргумента метода.
Нaзoвитe этoт фaйл 454 LambdasAsArgumentsDemo.java
*/

interface StringFunc {
  String func(String n);
}
class LambdasAsArgumentsDemo {
  // Типом первого параметра этого метода является функциональный интерфейс.
  // Таким образом, ему можно передавать ссыпку на любой экземпляр реализации
  // данного интерфейса, в том числе экземпляр, созданный лямбда-выражением.
  // Во втором параметре указывается строка, с которой нужно работать.
  static String stringOp(StringFunc sf, String s) {
    return sf.func(s);
  }
  public static void main(String[] args) {
    String inStr = "Lambdas add power to Java";
    String outStr;
    System.out.println("Иcxoднaя строка: " + inStr);
    // Простое одиночное лямбда-выражение, которое переводит
    // в верхний регистр строку, переданную методу stringOp().
    outStr = stringOp((str) -> str.toUpperCase(), inStr);
    System.out.println("Cтpoкa в верхнем регистре: " + outStr);
    // Передать блочное лямбда-выражение, которое удаляет пробелы.
    outStr = stringOp((str) -> {
      String result = "";
      int i;
      for(i = 0; i < str.length(); i++)
        if(str.charAt(i) != ' ')
          result += str.charAt(i);
      return result;
    }, inStr);
    System.out.println("Cтpoкa после удаления пробелов: " + outStr);
    // Конечно, можно также передавать экземпляр StringFunc, заблаговременно
    // созданный лямбда-выражением.Например, после выполнения следующего
    // объявления reverse будет ссылаться на экземпляр StringFunc.
    StringFunc reverse = (str) -> {
      String result = "";
      int i;
      for(i = str.length()-1; i >= 0; i--)
        result += str.charAt(i);
      return result;
    };
    // Теперь reverse можно передать в первом параметре методу stringOp(),
    // поскольку этот параметр является ссылкой на объект StringFunc.
    System.out.println("Cтpoкa с противоположным порядком следования символов: " +
                        stringOp(reverse, inStr));
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Иcxoднaя строка: Lambdas add power to Java
Cтpoкa в верхнем регистре: LAMBDAS ADD POWER TO JAVA
Cтpoкa после удаления пробелов: LambdasaddpowertoJava
Cтpoкa с противоположным порядком следования символов: avaJ ot rewop dda sadbmaL
*/

