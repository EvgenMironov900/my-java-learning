/*
В этой программе внутрь класса Вoх добавляется метод
Назовите этот файл 170 BoxDemo3.java
*/

class Вoх { 
  double width; 
  double height; 
  double depth; 
  // Отобразить объем коробки.
  void volume() { 
    System.out.print("Объем равен ");
    System.out.println(width * height * depth);
  }
}
class BoxDemo3 { 
    public static void main(String[] args) { 
    Вoх mybox1 = new Вoх();
    Вoх mybox2 = new Вoх();
    // Присвоить значения переменным экземпляра mybox1. 
    mybox1.width = 10; 
    mybox1.height = 20; 
    mybox1.depth = 15; 
    /* Присвоить переменным экземпляра mybox2 другие значения.*/ 
    mybox2.width = 3; 
    mybox2.height = 6; 
    mybox2.depth = 9; 
    // Отобразить объем первой коробки.
    mybox1.volume();
    // Отобразить объем второй коробки.
    mybox2.volume();
  }
}

/*
Результат работы программы:

Объем равен 3000.0
Объем равен 162.0
*/

