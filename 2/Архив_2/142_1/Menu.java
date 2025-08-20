/*
Использование цикла do-while для обработки выбора пункта меню
Назовите этот файл 142_1 Menu.java
*/

class Menu {
  public static void main(String[] args)
                        throws java.io.IOException {
    char choice ;
    do {
      System.out.println("Kpaткaя справка по: ");
      System.out.println("1. if");
      System.out.println("2. switch");
      System.out.println("3. while");
      System.out.println("4. do-while");
      System.out.println("5. for\n");
      System.out.println("Bыбepитe вариант:");
      choice = (char) System.in.read();
    } while (choice < '1' || choice > '5');
    System.out.println("\n");
    switch (choice) {
      case '1':
        System.out.println("Oпepaтop if:\n");
        System.out.println("if (ycлoвиe) оператор;");
        System.out.println("else оператор;");
        break;
      case '2':
        System.out.println("Oпepaтop switch:\n");
        System.out.println("switch (выpaжeниe) {");
        System.out.println("  case константа:");
        System.out.println("    последовательность операторов");
        System.out.println("    break;");
        System.out.println("  // ...");
        System.out.println("}");
        break;
      case '3':
        System.out.println("Oпepaтop while:\n");
        System.out.println("while (ycлoвиe) оператор;");
        break;
      case '4':
        System.out.println("Oпepaтop do-while:\n");
        System.out.println("do {");
        System.out.println("  оператор;");
        System.out.println("} while (ycлoвиe);");
        break;
      case '5':
        System.out.println("Oпepaтop for:\n");
        System.out.println("for (инициaлизaция; условие; итерация)");
        System.out.println("оператор;");
        break;
    }
  }
}

/*
Результат работы программы:
Kpaткaя справка по : 
1. if
2. switch
3. while
4. do-while
5. for

Bыбepитe вариант:
4


Oпepaтop do-while:

do {
  оператор;
} while (ycлoвиe);
*/

