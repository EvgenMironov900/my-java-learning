/*
В этой программе используется параметризованный метод
Назовите этот файл 174 BoxDemo5.java
*/

class Box {
  double width;
  double height;
  double depth;

  // Вычислить и возвратить объем.
  double volume() {
    return width * height * depth;
  }
  // Установить размеры коробки.
  void setDim(double w, double h, double d) {
    width = w;
    height = h;
    depth = d;
  }
}
class BoxDemo5 {
  public static void main(String[] args) {
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol; 
    // Инициализировать объекты коробок.
    mybox1.setDim(10, 20, 15);
    mybox2.setDim(3, 6, 9);
    // Получить объем первой коробки.
    vol = mybox1.volume(); 
    System.out.println("Oбъeм равен " + vol);
    // Получить объем второй коробки.
    vol = mybox2.volume();
    System.out.println("Oбъeм paвeн " + vol);
  }
}

/*
Результат работы программы:

Oбъeм равен 3000.0
Oбъeм paвeн 162.0
*/

