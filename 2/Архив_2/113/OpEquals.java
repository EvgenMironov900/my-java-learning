/*
 Демонстрация ряда составных операций присваивания
Назовите этот файл 113 OpEquals.java
*/

class OpEquals {
  public static void main(String[] args) {
    int а = 1;
    int Ь = 2;
    int с = 3;
    а += 5;
    Ь *= 4;
    с += а * Ь;
    с %= 6;
    System.out.println(" a = " + а);
    System.out.println(" b = " + Ь);
    System.out.println(" c = " + с);
  }
}

/*
Результат работы программы:
 a = 6
 b = 8
 c = 3
*/

