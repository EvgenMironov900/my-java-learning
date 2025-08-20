/*
Сдвиг влево значения byte
Назовите этот файл 119 ByteShift.java
*/
class ByteShift {
  public static void main(String[] args) {
byte a = 64, b;
int i;
i = a << 2;
b = (byte) (a << 2) ;
    System.out.println("Пepвoнaчaльнoe значение a: " + a);
    System.out.println("i и b: " + i + " " + b);
  }
}

/*
Результат работы программы:

Пepвoнaчaльнoe значение a: 64
i и b: 256 0
*/

