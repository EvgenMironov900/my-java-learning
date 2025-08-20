
/*

 Использование операции iпstanceof с иерархией обобщенных классов.
Нaзoвитe этoт фaйл 432 HierDemoЗ.java
*/

class Gen<T> {
  T оb;
  Gen(T о) {
    оb = о;
  }
  // Возвратить оb.
  T getOb() {
    return оb;
  }
}
// Подкласс Gen.
class Gen2<T> extends Gen<T> {
  Gen2(T o) {
    super(o);
  }
}
// Демонстрация последствий идентификации типов во время
// выполнения для иерархии обобщенных классов.
class HierDemoЗ {
  public static void main(String[] args) {
    // Создать объект Gen для Integer.
    Gen<Integer> iOb = new Gen<Integer>(88);
    // Создать объект Gen2 для Integer.
    Gen2<Integer> iOb2 = new Gen2<Integer>(99);
    // Создать объект Gen2 для String.
    Gen2<String> strOb2 = new Gen2<String>("Tecт обобщений");
    // Выяснить, является ли iOb    2 какой-то формой Gen2.
    if(iOb2 instanceof Gen2<?>)
        System.out.println("iOb2 - экземпляр Gen2");
    // Выяснить, является ли iOb2 какой-то формой Gen.
    if(iOb2 instanceof Gen<?>)
        System.out.println("iOb2 - экземпляр Gen");
    System.out.println();
    // Выяснить, является ли strOb2 экземпляром Gen2.
    if(strOb2 instanceof Gen2<?>)
        System.out.println(" strOb2 - экземпляр Gen2");
    // Выяснить, является ли strOb2 экземпляром Gen.
    if(strOb2 instanceof Gen<?>)
        System.out.println(" strOb2 - экземпляр Gen");
    System.out.println();
    // Выяснить, является ли iOb экземпляром Gen2, что не так.
    if(iOb instanceof Gen2<?>)
        System.out.println("iOb - экземпляр Gen2");
    // Выяснить, является ли iOb экземпляром Gen, что так.
    if(iOb instanceof Gen<?>)
    System.out.println("iOb - экземпляр Gеn");
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

iOb2 - экземпляр Gen2
iOb2 - экземпляр Gen

 strOb2 - экземпляр Gen2
 strOb2 - экземпляр Gen

iOb - экземпляр Gеn
*/

