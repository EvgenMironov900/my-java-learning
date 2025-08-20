
/*
Расширение класса BoxWeight с целью включения стоимости доставки
Назoвитe этoт файл 227 DemoShipment.java
*/

// Начать с Box.
class Box {
  private double width;
  private double height;
  private double depth;
  // Конструктор, применяемый для клонирования объекта.
  Box(Box ob) { // передать объект конструктору
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
  }
  // Конструктор, используемый в случае указания всех размеров.
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
  // Конструктор, применяемый в случае, если размеры вообще не указаны.
  Box() {
    width = -1; // использовать -1 для обозначения
    height = -1; // неинициализированного
    depth = -1; // объекта коробки
  }
  // Конструктор, используемый в случае создания объекта кубической коробки
  Box (double len) {
    width = height = depth = len;
  }
  // Вычислить и возвратить объем.
  double volume () {
    return width * height * depth;
  }
}
// Добавить вес.
class BoxWeight extends Box {
  double weight;        // вес коробки
  // Конструктор, применяемый для клонирования объекта.
  BoxWeight (BoxWeight ob) { // передать объект конструктору
    super (ob);
    weight = ob.weight;
  }
  // Конструктор, используемый в случае указания всех параметров.
  BoxWeight (double w, double h, double d, double m) {
    super (w, h, d); // вызвать конструктор суперкласса
    weight = m;
  }
  // Стандартный конструктор.
  BoxWeight() {
    super();
    weight = -1;
  }
  // Конструктор, используемый в случае создания объекта кубической коробки
  BoxWeight (double len, double m) {
    super (len);
    weight = m;
  }
}
// Добавить стоимость доставки.
class Shipment extends BoxWeight {
  double cost;
  // Конструктор, применяемый для клонирования объекта.
  Shipment (Shipment ob) { // передать объект конструктору
    super (ob);
    cost = ob.cost;
  }
  // Конструктор, используемый в случае указания всех параметров.
  Shipment (double w, double h, double d,
              double m, double с) {
    super (w, h, d, m);             // вызвать конструктор суперкласса
    cost = с;
  }
  // Стандартный конструктор.
  Shipment () {
    super ();
    cost = -1;
  }
  // Конструктор, используемый в случае создания объекта кубической коробки
  Shipment (double len, double m, double с) {
    super (len, m);
    cost = с;
  }
}
class DemoShipment {
  public static void main(String[] args) {
    Shipment shipment1 = new Shipment (10, 20, 15, 10, 3.41);
    Shipment shipment2 = new Shipment (2, 3, 4, 0.76, 1.28);
    double vol;
    vol = shipment1.volume();
    System.out.println("Oбъeм shipment1 равен " + vol);
    System.out.println("Вес shipment1 равен " + shipment1.weight);
    System.out.println("Cтoимocть доставки: $" + shipment1.cost);
    System.out.println();
    vol = shipment2.volume();
    System.out.println ("Oбъeм shipment2 равен "+ vol);
    System.out.println ("Вес shipment2 равен " + shipment2.weight);
    System.out.println ("Cтoимocть доставки: $" + shipment2.cost);
  }
}

/*
Рeзультат рабoты прoграммы:

Oбъeм shipment1 равен 3000.0
Вес shipment1 равен 10.0
Cтoимocть доставки: $3.41

Oбъeм shipment2 равен 24.0
Вес shipment2 равен 0.76
Cтoимocть доставки: $1.28*/

