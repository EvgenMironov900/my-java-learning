/*

Назовите этот файл 096 Conversion.java
*/

class Conversion {
  public static void main(String[] args) {
  byte Ь;
  int i = 257;
  double d = 323.142;
  System.out.println("\nПpeoбpaзoвaниe int в byte.");
  Ь = (byte)i;
  System.out.println("i и Ь : " + i + " " + Ь );
  System.out.println("\nПpeoбpaзoвaниe double в int.");
  i = (int)d;
  System.out.println("d и i : " + d + " " + i);
  System.out.println("\nПреобразование double в byte.");
  Ь = (byte)d;
  System.out.println("d и Ь : " + d + " " + Ь);
  }
}

/*
Результат работы программы:


Пpeoбpaзoвaниe int в byte.
i и Ь : 257 1

Пpeoбpaзoвaниe double в int.
d и i : 323.142 323

Преобразование double в byte.
d и Ь : 323.142 67 


*/

