/*
Здесь в Box используется параметризованный конструктор
для инициализации размеров коробки.
Назовите этот файл 177 BoxDemo7.java
*/

class Box {
  double width;
  double height;
  double depth;
  // Это конструктор для Box.
  Box(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
  // Вычислить и возвратить объем.
  double volume() {
    return width * height * depth;
  }
}

class BoxDemo7 {
  public static void main(String[] args) {
    // Объявить, разместить в памяти и инициализировать объекты Box.
    // ?????????????mybox1 = new Box( 10, 20, 15);  // ?????? Похоже, опечатка в книге
    Box mybox1 = new Box( 10, 20, 15); // ??????
    Box mybox2 = new Box(3, 6, 9);
    double vol;
    // Получить объем первой коробки.
    vol = mybox1.volume();
    System.out.println("Oбъeм равен "+ vol);
    // Получить объем второй коробки.
    vol = mybox2. volume();
    System.out.println("Oбъeм равен "+ vol);
  }
}

/*
Результат работы программы:

Oбъeм равен 3000.0
Oбъeм равен 162.0
*/








