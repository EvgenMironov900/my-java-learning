/*
Демонстрация работы побитовых логических операций
Назовите этот файл 118 BitLogic.java
*/
class BitLogic {
  public static void main(String[] args) {
    String[] binary = {
      "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
      "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
};
int a = 3; // О + 2 + 1 или 0011 в двоичной форме
int b = 6; // 4 + 2 + О или 0110 в двоичной форме
int c = a | b;
int d = a & b;
int e = a ^ b;
int f = (~a & b ) | ( a & ~b);
int g = ~a & 0x0f ;
    System.out.println("        a = " + binary[a]);
    System.out.println("        b = " + binary[b]);
    System.out.println("    a | b = " + binary[c]);
    System.out.println("    a & b = " + binary[d]);
    System.out.println("    a ^ b = " + binary[e]);
    System.out.println("~a&b|a&~b = " + binary[f]);
    System.out.println("       ~a = " + binary[g]);
  }
}

/*
Результат работы программы:
        a = 0011
        b = 0110
    a | b = 0111
    a & b = 0010
    a ^ b = 0101
~a&b|a&~b = 0101
       ~a = 1100
*/

