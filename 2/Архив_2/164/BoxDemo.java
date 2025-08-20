/*
Программа, в которой используется класс Вох
Назовите этот файл 164 BoxDemo.java 
*/ 
class Вoх { 
  double width; 
  double height; 
  double depth; 
}
// В этом классе объявляется объект типа Вoх.
class BoxDemo { 
  public static void main(String[] args) {
  Вoх mybox = new Вoх(); 
  double vol;
  // Присвоить значения переменным экземпляра mybox. 
  mybox.width = 10; 
  mybox.height = 20; 
  mybox.depth = 15; 
  // Вычислить объем коробки . 
  vol = mybox.width * mybox.height * mybox.depth; 
  System.out.println("Oбъeм равен "+ vol );
  }
}

/*
Результат работы программы:

Oбъeм равен 3000.0
*/

