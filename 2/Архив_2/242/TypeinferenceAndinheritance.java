/*
При работе с наследованием выведенным типом является объявленный
тип инициализатора и он может отличаться от производного
типа объекта, на который ссылается инициализатор.
Назoвитe этoт файл 242 TypeinferenceAndinheritance.java
*/

class MyClass {
  //...
}
class FirstDerivedClass extends MyClass {
  int x;
  //...
}
class SecondDerivedClass extends FirstDerivedClass {
  int y;
  //...
}
class TypeinferenceAndinheritance {
  // Возвратить некоторый тип объекта MyClass.
  static MyClass getObj(int which) {
    switch(which) {
      case 0: return new MyClass();
      case 1: return new FirstDerivedClass();
      default : return new SecondDerivedClass();
    }
  }
  public static void main(String[] args) {
    // Несмотря на то что getObj() возвращает различные типы
    // объектов в иерархии наследования MyClass, объявленным
    // типом возвращаемого значения является MyClass.
    // В результате во всех трех показанных здесь случаях
    // предполагается, что типом переменных является MyClass,
    // хотя получаются разные производные типы объектов.
    // В этом случае getObj() возвращает объект MyClass.
    var mc = getObj(0);
    // В этом случае getObj() возвращает объект FirstDerivedClass.
    var mc2 = getObj(1);
    // в этом случае getObj() возвращает объект SecondDerivedClass.
    var mcЗ = getObj(2);
    // Поскольку 'тиnы mc2 и mcЗ выводятся как MyClass(т.к. возвращаемым типом
    // getObj() является MyClass) , то ни mc2 , ни mcЗ не могут получить доступ
    // к полям, объявленным в FirstDerivedClass или SecondDerivedClass.
    // mc2.x = 10; // Ошибка ! Класс MyClass не имеет поля х.
    // mcЗ.у = 10; // Ошибка ' Класс MyClass не имеет поля у.
  }
}

/*
Рeзультат рабoты прoграммы:

Если раскомментировать строку 44:
TypeinferenceAndinheritance.java:44: error: cannot find symbol
    mc2.x = 10; // Ошибка ! Класс MyClass не имеет поля х.
       ^
  symbol:   variable x
  location: variable mc2 of type MyClass
1 error

Если раскомментировать строку 45:
TypeinferenceAndinheritance.java:45: error: cannot find symbol
    mcЗ.у = 10; // Ошибка ' Класс MyClass не имеет поля у.
       ^
  symbol:   variable у
  location: variable mcЗ of type MyClass

*/

