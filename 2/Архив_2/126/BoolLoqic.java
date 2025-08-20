/*
Демонстрация работы булевских логических операций
Назовите этот файл 126 BoolLoqic.java
*/

class BoolLoqic {
  public static void main(String[] args) {
    boolean a = true;
    boolean b = false ;
    boolean c = a | b;
    boolean d = a & b;
    boolean е = a ^ b ;
    boolean f = (!a & b) | (a & !b);
    boolean g = !a;
    System.out.println("        a = " + a);
    System.out.println("        b = " + b);
    System.out.println("    a | b = " + c);
    System.out.println("    a & b = " + d);
    System.out.println("    a ^ b = " + е);
    System.out.println("!a&b|a&!b = " + f);
    System.out.println("       !a = " + g);
  }
}

/*
Результат работы программы:
        a = true
        b = false
    a | b = true
    a & b = false
    a ^ b = true
!a&b|a&!b = true
       !a = false

*/

