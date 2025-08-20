
/*

 Переопределение обобщенного метода в обобщенном классе.
Нaзoвитe этoт фaйл 435 OverrideDemo.java
*/

class Gen<T> {
  T оb; // объявить объект типа T
  // Передать конструктору ссылку на объект типа T.
  Gen(T о) {
    оb = о;
  }
  // Возвратить оb.
  T getOb() {
    System.out.print("getOb() в Gen : ");
    return оb;
  }
}
// Подкласс Gen, в котором переопределяется getOb().
class Gen2<T> extends Gen<T> {
  Gen2(T o) {
    super(o);
  }
  // Переопределить getOb().
  T getOb() {
    System.out.print("getOb() в Gen2 : ");
    return оb;
  }
}
// Демонстрация переопределения обобщенного метода.
class OverrideDemo {
  public static void main(String[] args) {
    // Создать объект Gen для Integer.
    Gen<Integer> iOb = new Gen<Integer>(88);
    // Создать объект Gen2 для Integers.
    Gen2<Integer> iOb2 = new Gen2<Integer>(99);
    // Создать объект Gen2 для Strings.
    Gen2<String> strOb2 = new Gen2<String>("Тест обобщений");
    System.out.println(iOb.getOb());
    System.out.println(iOb2.getOb());
    System.out.println(strOb2.getOb());
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

getOb() в Gen : 88
getOb() в Gen2 : 99
getOb() в Gen2 : Тест обобщений
*/

