/*
В этой программе объявляются два объекта Вох
Назовите этот файл 165 BoxDemo2.java
*/

class Вох {
double width ;
double height ;
double depth ;
}
class BoxDemo2 {
  public static void main(String[] args) {
Вох mybox1 = new Вох();
Вох mybox2 = new Вох();
double vol;
// Присвоить значения переменным экземпляра mybox1.
mybox1.width = 10;
mybox1.height = 20;
mybox1.depth = 15;
// Присвоить переменным экземпляра mybox2 другие значения.
mybox2.width = 3;
mybox2.height = 6;
mybox2.depth = 9;
// Вычислить объем первой коробки.
vol = mybox1.width * mybox1.height * mybox1.depth;
System.out.println("Oбъём равен " + vol);
// Вычислить объем второй коробки.
vol = mybox2.width * mybox2.height * mybox2.depth ;
System.out.println("Oбъём равен " + vol);
  }
}

/*
Результат работы программы:

Oбъём равен 3000.0
Oбъём равен 162.0
*/

