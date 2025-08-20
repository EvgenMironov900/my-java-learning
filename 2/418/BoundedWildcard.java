
/*

 Ограниченный аргумент с подстановочным знаком.
Нaзoвитe этoт фaйл 418 BoundedWildcard.java
*/

// Двумерные координаты.
class TwoD {
  int x, y;
  TwoD(int а, int Ь) {
    x = а;
    y = Ь;
  }
}
// Трехмерные координаты.
class ThreeD extends TwoD {
  int z;
  ThreeD(int а, int Ь, int с) {
    super(а, Ь);
    z = с;
  }
}
// Четырехмерные координаты.
class FourD extends ThreeD {
  int t;
  FourD(int а, int Ь, int с, int d) {
    super(а, Ь, с);
    t = d;
  }
}
// Этот класс хранит массив объектов координат.
class Coords<T extends TwoD> {
  T[] coords;
  Coords(T[] о) {
    coords = о;
  }
}
// Демонстрация использования ограниченного
// аргумента с подстановочным знаком.
class BoundedWildcard {
  static void showXY(Coords<?> c) {
    System.out.println("Koopдинaты X Y: ");
    for(int i=0; i < c.coords.length; i++)
      System.out.println(c.coords[i].x + " " +
                          c.coords[i].y);
    System.out.println();
  }
  static void showXYZ(Coords<? extends ThreeD> c) {
    System.out.println("Координаты X Y Z: ");
    for(int i=0; i < c.coords.length; i++)
      System.out.println(c.coords[i].x + " " +
                          c.coords[i].y + " " +
                          c.coords[i].z);
    System.out.println();
  }
  static void showAll(Coords<? extends FourD> c) {
    System.out.println("Koopдинaты X Y Z T: ");
    for(int i=0; i < c.coords.length; i++)
      System.out.println(c.coords[i].x +" " +
                          c.coords[i].y + " " +
                          c.coords[i].z + " " +
                          c.coords[i].t);
    System.out.println();
  }
  public static void main(String[] args) {
    TwoD[] td = {
      new TwoD(0, 0),
      new TwoD(7, 9),
      new TwoD(18, 4),
      new TwoD(-1, -23)
    };
    Coords<TwoD> tdlocs = new Coords<TwoD>(td);
    System.out.println("Содержимое tdlocs.");
    showXY(tdlocs); // Нормально, это объект TwoD
    // showXYZ(tdlocs); // Ошибка, не объект ThreeD
    // showAll(tdlocs); // Ошибка, не объект FourD
    // Создать несколько объектов FourD.
    FourD[] fd = {
      new FourD(1, 2, 3, 4),
      new FourD(6, 8, 14, 8),
      new FourD(22, 9, 4, 9),
      new FourD(3, -2, -23, 17)
    };
    Coords<FourD> fdlocs = new Coords<FourD>(fd);
    System.out.println("Coдepжимoe fdlocs.");
    // Все вызовы ВЫПОЛНЯТСЯ успешно.
    showXY(fdlocs);
    showXYZ(fdlocs);
    showAll(fdlocs);
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Содержимое tdlocs.
Koopдинaты X Y: 
0 0
7 9
18 4
-1 -23

Coдepжимoe fdlocs.
Koopдинaты X Y: 
1 2
6 8
22 9
3 -2

Координаты X Y Z: 
1 2 3
6 8 14
22 9 4
3 -2 -23

Koopдинaты X Y Z T: 
1 2 3 4
6 8 14 8
22 9 4 9
3 -2 -23 17

*/

