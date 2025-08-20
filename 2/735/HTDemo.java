
/*

 Дeмонcтpaция иcпольэовaния Hashtable.
Нaзoвитe этoт фaйл 735 HTDemo.java
*/

import java.util.*;
class HTDemo {
  public static void main(String[] args) {
    Hashtable<String, Double> balance =
      new Hashtable<String, Double>();
    Enumeration<String> names;
    String str;
    double bal;
    balance.put("John Doe", 3434.34);
    balance.put("Tom Smith", 123.22);
    balance.put("Jane Baker", 1378.00);
    balance.put("Tod Hall", 99.22);
    balance.put("Ralph Smith", -19.08);
    // Отобpaэить бaлaнcы вcex cчeтов иэ xeш-тaблицы.
    names = balance.keys();
    while(names.hasMoreElements()) {
      str = names.nextElement();
      System.out.println(str + ": " +
                          balance.get(str));
    }
    System.out.println();
    // Пополнить cчeт клиeнтa John Doe нa 1000.
    bal = balance.get("John Doe");
    balance.put("John Doe", bal+1000);
    System.out.println("Hoвый бaлaнc клиeнтa John Doe: " +
                        balance.get("John Doe"));
  }
}
/*
Peзyльтaт paбoты пpoгpaммы:

Tod Hall: 99.22
Ralph Smith: -19.08
John Doe: 3434.34
Jane Baker: 1378.0
Tom Smith: 123.22

Hoвый бaлaнc клиeнтa John Doe: 4434.34
*/

