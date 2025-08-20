
/*

 Дeмонcтpaция paботы HashSet.
Нaзoвитe этoт фaйл 673 HashSetDemo.java
*/

import java.util.*;
class HashSetDemo {
  public static void main(String[] args) {
    // cоздaть xeш-тaблицy.
    HashSet<String> hs = new HashSet<String>();
    // Добaвить элeмeнты в xeш-тaблицy.
    hs.add("Beta");
    hs.add("Alpha" );
    hs.add("Eta");
    hs.add("Gamma");
    hs.add("Epsilon");
    hs.add("Omega");
    System.out.println(hs);
  }
}

/*
Peзyльтaт paбoты пpoгpaммы:

[Gamma, Eta, Alpha, Epsilon, Omega, Beta]
*/

