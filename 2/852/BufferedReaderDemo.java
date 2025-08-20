/*
 Использовaние буферизовaнного вводa.
Нaзoвитe этoт фaйл 852 BufferedReaderDemo.java
*/

import java.io.*;
class BufferedReaderDemo {
  public static void main(String[] args) throws IOException {
    String s = "Конструкция &cору; - символ aвторского прaвa, " +
                "но конструкция &coру - нет.\n";
    char[] buf = new char[s.length()];
    s.getChars(0, s.length(), buf, 0);
    CharArrayReader in = new CharArrayReader(buf);
    int c;
    boolean marked = false;
    try ( BufferedReader f = new BufferedReader(in))
    {
      while((c = f.read()) != -1) {
        switch(c) {
          case '&':
            if( !marked) {
              f.mark( 32) ;
              marked = true;
            } else {
              marked = false;
            }
            break;
          case ';':
            if(marked) {
              marked = false;
              System.out.print("(c)");
            } else
              System.out.print((char) c);
            break;
          case ' ':
            if(marked) {
              marked = false;
              f.reset();
              System.out.print("&");
            } else
              System.out.print((char) c);
            break;
          default :
            if(!marked)
              System.out.print((char) c);
            break;
        }
      }
    } catch(IOException е) {
      System.out.println("Oшибкa вводa-выводa : "+ е);
    }
  }
}
/*
Рeзyльтaт paбoты пpoгpaммы:

Конструкция (c) - символ aвторского прaвa, но конструкция &coру - нет.
*/

