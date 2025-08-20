
/*

Назoвитe этoт файл Demo.java
*/

// Тестирование пакета p1.
package p1;
// Создать экземпляры различных классов в p1.
public class Demo {
  public static void main(String[] args) {
    Protection оb1 = new Protection();
    Derived оb2 = new Derived();
    SamePackage оbЗ = new SamePackage();
  }
}

/*
Рeзультат рабoты прoграммы:

Koнcтpyктop базового класса
n = 1
n_pri = 2
n_pro = 3
n_pub = 4
Koнcтpyктop базового класса
n = 1
n_pri = 2
n_pro = 3
n_pub = 4
Koнcтpyктop производного класса
n =1
n_pro = 3
n_pub = 4
Koнcтpyктop базового класса
n = 1
n_pri = 2
n_pro = 3
n_pub = 4
 Koнcтpyктop класса из того же пакета 
 n = 1
 n_pro = 3
 n_pub = 4
*/

