/*
Здесь класс Вох расширяется для включения свойства цвета
Назoвитe этoт файл 220_1 DemoBoxWeightColor.java
*/

// В этой программе используется наследование для расширения класса Вох.
class Box {
  double width;
  double height;
  double depth;
// Конструктор, применяемый для клонирования объекта.
  Box(Box ob) { // передать объект конструктору
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }
// Конструктор, используемый в случае указания всех размеров.
  Box (double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
// Конструктор, применяемый в случае , если размеры вообще не указаны.
  Box () {
    width = -1; // использовать -1 для обозначения
    height = -1;  // неинициализированного
    depth = -1;   // объекта коробки
  }
// Конструктор, используемый в случае создания объекта кубической коробки.
  Box (double len) {
    width = height = depth = len;
  }
// Вычислить и возвратить объем.
  double volume () {
    return width * height * depth;
  }
}
// Здесь класс Вох расширяется с целью включения члена weight.
class BoxWeight extends Box {
  double weight; // вес коробки
// Конструктор для BoxWeight.
  BoxWeight(double w, double h, double d, double m) {
    width = w;
    height = h;
    depth = d;
    weight = m;
  }
}

// Здесь класс Вох расширяется для включения свойства цвета
class ColorBox extends Box {
  int color; // цвет коробки
  ColorBox(double w, double h, double d, int с) {
    width = w;
    height = h ;
    depth = d ;
    color = с ;
  }
}
class DemoBoxWeightColor {
  public static void main (String[] args) {
    BoxWeight mybox1 = new BoxWeight (10, 20, 25, 34.3);
    double vol;
    int col;
    vol = mybox1.volume();
    System.out.println("Oбъeм mybox1 равен " + vol);
    System.out.println("Вес mybox1 равен " + mybox1.weight);

    ColorBox mybox01 = new ColorBox (10, 20, 15, 1);
    System.out.println("Номер цвета mybox01 равен " + mybox01.color);

    System.out.println();
    BoxWeight mybox2 = new BoxWeight (2, 3, 4, 0.076);
    vol = mybox2.volume();
    System.out.println("Oбъeм mybox2 равен " + vol);
    System.out.println("Вес mybox2 равен " + mybox2.weight);

    ColorBox mybox02 = new ColorBox (2, 3, 4, 2);
    System.out.println("Номер цвета mybox02 равен " + mybox02.color);

  }
}

/*
Рeзультат рабoты прoграммы:

Oбъeм mybox1 равен 5000.0
Вес mybox1 равен 34.3
Номер цвета mybox01 равен 1

Oбъeм mybox2 равен 24.0
Вес mybox2 равен 0.076
Номер цвета mybox02 равен 2
*/

