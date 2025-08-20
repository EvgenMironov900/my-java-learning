/*
В программе создается несколько целочисленных пере­менных, с которыми затем осуществляются манипуляции с применением со­ставных побитовых операций присваивания.
Назовите этот файл 123 OpBitEquals.java
*/

class OpBitEquals {
  public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = 3;
    a |= 4;
    b >>= 1;
    c <<= 1;
    a ^= c;
    System.out.println("a = " + a) ;
    System.out.println("b = " + b ) ;
    System.out.println("c = " + c ) ;
  }
}

/*
Результат работы программы:
a = 3
b = 1
c = 6
*/

