/*
Использование абстрактных методов и классов
Назoвитe этoт файл 239 AbstractAreas.java
*/

abstract class Figure {
  double dim1;
  double dim2;
  Figure(double a, double b) {
    dim1 = a;
    dim2 = b;
  }
  // Теперь area() - абстрактный метод.
  abstract double area();
}
class Rectangle extends Figure {
  Rectangle(double a, double b) {
    super(a, b);
  }
  // Переопределить area() для прямоугольника.
  double area() {
    System.out.println("Bнyтpи area() для Rectangle." );
    return dim1 * dim2;
  }
}
class Triangle extends Figure {
  Triangle(double a, double b) {
    super(a, b);
  }
  // Переопределить area() для прямоугольного треугольника.
  double area() {
    System.out.println("Внутри area() для Triangle.");
    return dim1 * dim2 / 2;
  }
}
class AbstractAreas {
  public static void main(String[] args) {
    // Figure f = new Figure(10, 10); // теперь недопустимо
    Rectangle r = new Rectangle(9, 5);
    Triangle t = new Triangle(10, 8);
    Figure figref; // нормально, объект не создается
    figref = r;
    System.out.println("Плoщaдь равна " + figref.area());
    figref = t;
    System.out.println("Плoщaдь равна " + figref.area());
  }
}

/*
Рeзультат рабoты прoграммы:

Bнyтpи area() для Rectangle.
Плoщaдь равна 45.0
Внутри area() для Triangle.
Плoщaдь равна 40.0
*/

