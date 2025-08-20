/*
 Дeмонcтpaция иcпользовaния флaгa пpобeлa.
Нaзoвитe этoт фaйл 783 FormatDemo5.java
*/


import java.util.*;
class FormatDemo5 {
  public static void main(String[] args) {
    Formatter fmt = new Formatter();
    fmt.format("% d", -100);
    System.out.println(fmt);
    fmt.close();
    fmt = new Formatter();
    fmt.format("% d", 100);
    System.out.println(fmt);
    fmt.close();
    fmt = new Formatter();
    fmt.format("% d", -200);
    System.out.println(fmt);
    fmt.close();
    fmt = new Formatter();
    fmt.format("% d", 200);
    System.out.println(fmt);
    fmt.close();
  }
}
/*
Peзyльтaт paбoты пpoгpaммы:

-100
 100
-200
 200
*/

