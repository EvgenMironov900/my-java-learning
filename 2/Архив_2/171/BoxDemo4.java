/*
Теперь volume() возвращает объем коробки
Назовите этот файл 171 BoxDemo4.java
*/

class Box { 
  double width; 
  double height;
  double depth; 
  // Вычислить и возвратить объем. 
  double volume() {
    return width * height * depth;
  }
}
class BoxDemo4 {
  public static void main(String[] args) {
    Box mybox1 = new Box();
    Box mybox2 = new Box();
    double vol;
    // Присвоить значения переменным экземпляра mybox1. 
    mybox1.width = 10; 
    mybox1.height = 20; 
    mybox1.depth = 15; 
    /* Присвоить переменным экземпляра mybox2 другие значения.*/ 
    mybox2.width = 3; 
    mybox2.height = 6; 
    mybox2.depth = 9; 
    // Получить объем первой коробки. 
    vol = mybox1.volume(); 
    System.out.println("Объем равен " + vol);
    // Получить объем второй коробки.
    vol = mybox2.volume();
    System.out.println("Oбъeм равен " + vol);
  }
}

/*
Результат работы программы:

Объем равен 3000.0
Oбъeм равен 162.0
*/

