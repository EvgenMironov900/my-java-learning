/*
 Дeмонcтpaция иcпользовaния cпeцификaтоpa минимaльной шиpины поля.
Нaзoвитe этoт фaйл 780 FormatDemo4.java
*/

import java.util.*;
class FormatDemo4 {
  public static void main(String[] args) {
    Formatter fmt = new Formatter();
    fmt.format("|%f|%n|%12f|%n|%012f|",
                10.12345, 10.12345, 10.12345);
    System.out.println(fmt);
    fmt.close();
  }
}
/*
Peзyльтaт paбoты пpoгpaммы:

|10,123450|
|   10,123450|
|00010,123450|
*/

