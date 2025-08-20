/*
Демонстрация использования значений boolean
Назовите этот файл 086_1 BoolTest.java
*/

class BoolTest {
  public static void main(String[] args) {
    boolean b;
    b = false;
    System.out.println("b равно " + b);
    b = true;
    System.out.println("b равно " + b);
    // Значение boolean может управлятb оператором if.
    if (b) System.out.println("Этo выполняется.");
    b = false;
    if (b) System.out.println(" Этo не выполняется.");
    // Результатом операции отношения является значение boolean .
    System.out.println("10 > 9 равно " + (10 > 9));
  }
}
/*
Результат работы программы:

b равно false
b равно true
Этo выполняется.
10 > 9 равно true
*/

