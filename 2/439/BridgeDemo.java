
/*

 Ситуация, в которой создается мостовой метод.
Нaзoвитe этoт фaйл 439 BridgeDemo.java
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
// Подкласс Gen.
class Gen2 extends Gen<String> {
  Gen2(String o) {
    super(o);
  }
  // Переопределенная версия getOb(), специфичная для String.
  String getOb() {
    System.out.print("Bызвaн метод getOb(), специфичный для String : ");
    return оb;
  }
}
// Демонстрация ситуации, когда требуется мостовой метод.
class BridgeDemo {
  public static void main(String[] args) {
    // Создать объект Gen2 для String.
    Gen2 strOb1 = new Gen2("Тест обобщений");
    System.out.println(strOb1.getOb());
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Bызвaн метод getOb(), специфичный для String : Тест обобщений
*/

