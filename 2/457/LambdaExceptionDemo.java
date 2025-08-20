
/*

 Генерация исключения в лямбда-выражении.
Нaзoвитe этoт фaйл 457 LambdaExceptionDemo.java
*/

interface DoubleNumericArrayFunc {
  double func(double[] n) throws EmptyArrayException;
}
class EmptyArrayException extends Exception {
  EmptyArrayException() {
    super("Массив пуст");
  }
}
class LambdaExceptionDemo {
  public static void main(String[] args) throws EmptyArrayException {
    double[] values = { 1.0, 2.0, 3.0, 4.0 };
    // Это блочное лямбда-выражение вычисляет среднее
    // значение для массива элементов типа double.
    DoubleNumericArrayFunc average =(n) -> {
      double sum = 0;
      if(n.length == 0)
        throw new EmptyArrayException();
      for(int i=0; i < n.length; i++)
        sum += n[i];
      return sum / n.length;
    };
    System.out.println("Cpeднee значение равно " + average.func(values));
    // Следующий код приводит к генерации исключения.
    System.out.println("Среднее значение равно " + average.func(new double[0]));
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Cpeднee значение равно 2.5

Exception in thread "main" EmptyArrayException: Массив пуст
	at LambdaExceptionDemo.lambda$main$0(LambdaExceptionDemo.java:24)
	at LambdaExceptionDemo.main(LambdaExceptionDemo.java:31)
*/

