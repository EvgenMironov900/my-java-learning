
/*

 Демонстрация низкоуровневого типа в действии.
Нaзoвитe этoт фaйл 427 RawDemo.java
*/
  
class Gen<T> {
  T оb; // объявить объект типа T
  // Передать конструктору ссыпку на объект типа T.
  Gen(T о) {
    оb = о;
  }
  // Возвратить оb.
  T getOb() {
    return оb;
  }
}
// Использование низкоуровневого типа.
class RawDemo {
  public static void main(String[] args) {
    // Создать объект Gen дпя объектов Integer.
    Gen<Integer> iOb = new Gen<Integer>(88);
    // Создать объект Gen для объектов St ring.
   Gen<String> strOb = new Gen<String>("Тест обобщений");
   // Создать низкоуровневый объект Gen и предоставить ему значение Double.
   Gen raw = new Gen(Double.valueOf(98.6));
   // Приведение здесь обязательно, потому что тип неизвестен.
   double d =(Double) raw.getOb();
   System.out.println("знaчeниe : " + d);
   // Использование низкоуровневого типа может стать причиной
   // генерации исключений во время выполнения.
   // Вот несколько примеров.
   // Следующее приведение вызывает ошибку во время выполнения !
   // int i =(Integer) raw.getOb(); // ошибка во время выполнения
   // Это присваивание обходит механизм безопасности типов.
   strOb = raw; // Нормально, но потенциально неправильно
   // String str = strOb.getOb(); // ошибка во время выполнения
   // Это присваивание обходит механизм безопасности типов.
   raw = iOb; // Нормально, но потенциально неправильно
   // d =(Double) raw.getOb(); // ошибка во время выполнения
  }
}
/*
Рeзyльтaт paбoты пpoгpaммы:

Note: RawDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

знaчeниe : 98.6
*/
  
