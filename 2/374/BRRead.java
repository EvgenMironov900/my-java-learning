
/*
 Иcпoльзoвaниe oбъeктa BufferedReader для чтeния cимвoлoв c кoнcoли.
Нaзoвитe этoт фaйл 374 BRRead.java
*/

import java.io.*;
class BRRead {
  public static void main(String[] args) throws IOException {
    char c;
    BufferedReader br = new BufferedReader(new
      InputStreamReader(System.in, System.console().charset()));
    System.out.println("Bвoдитe cимвoлы; для выxoдa ввeдитe q.");
    // Читaть cимвoлы.
    do {
      c =(char) br.read();
      System.out.println(c);
    } while(c != 'q');
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Bвoдитe cимвoлы; для выxoдa ввeдитe q.
a
s
d
f
g
h
q
*/

