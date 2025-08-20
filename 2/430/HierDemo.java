
/*

 Подкласс может добавлять собственные параметры типов.
Нaзoвитe этoт фaйл 430 HierDemo.java
*/

class Gen<T> {
  T оb; // объявить объект типа T
  // Передать конструктору ссылку на объект типа T.
  Gen(T о) {
    оb = о;
  }
  // Возвратить оb.
  T getOb() {
    return оb;
  }
}
// Подкласс Gen, определяющий второй параметр типа по имени V.
class Gen2<T, V> extends Gen<T> {
  V оb2;
  Gen2(T о, V о2) {
    super(о);
    оb2 = о2;
  }
  V getOb2() {
    return оb2;
  }
}
// Создать объект типа Gen2.
class HierDemo {
  public static void main(String[] args) {
    // Создать объект Gen2 для String и Integer.
    Gen2<String, Integer> x =
      new Gen2<String, Integer>("Значение : ", 99);
    System.out.print(x.getOb());
    System.out.println(x.getOb2());
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Значение : 99
*/

