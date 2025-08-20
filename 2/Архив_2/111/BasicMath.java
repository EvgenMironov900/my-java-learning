/*
 Демонстрация основных арифметических операций
Назовите этот файл 111 BasicMath.java
*/
class BasicMath {
  public static void main(String[] args) {
    // Арифметические операции со значениями int .
    System.out.println(" Цeлoчиcлeннaя арифметика " ) ;
    int а = 1 + 1;
    int Ь = а * 3;
    int с = Ь / 4;
    int d = с - а;
    int е = -d;
    System.out.println("a = " + а);
    System.out.println("b = " + Ь);
    System.out.println("c = " + с);
    System.out.println("d = " + d);
    System.out.println("e = " + е);
    // Арифметические операции со значениями double .
    System.out.println("\nApифмeтикa с плавающей точкой" ) ;
    double da = 1 + 1 ;
    double db = da * 3 ;
    double dc = db / 4 ;
    double dd = dc - а ;
    double de = -dd;
    System.out.println("da = " + da);
    System.out.println("db = " + db);
    System.out.println("dc = " + dc);
    System.out.println("dd = " + dd);
    System.out.println("de = " + de);
  }
}

/*
Результат работы программы:
 Цeлoчиcлeннaя арифметика 
a = 2
b = 6
c = 1
d = -1
e = 1

Apифмeтикa с плавающей точкой
da = 2.0
db = 6.0
dc = 1.5
dd = -0.5
de = 0.5


*/

