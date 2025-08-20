
/*

Назoвитe этoт файл Demo.java
*/


// Тестирование пакета p2.
package p2;
// Создать экземпляры различных классов в p2.
public class Demo {
  public static void main(String[] args) {
    Protection2 оb1 = new Protection2();
    OtherPackage оb2 = new OtherPackage();
  }
}

/*
Рeзультат рабoты прoграммы:

Koнcтpyктop базового класса
n = 1
n_pri = 2
n_pro = 3
n_pub = 4
Koнcтpyктop производного класса из другого пакета
n_pro = 3
n_pub = 4
Koнcтpyктop базового класса
n = 1
n_pri = 2
n_pro = 3
n_pub = 4
Конструктор класса из другого пакета
n_pub 4*/

