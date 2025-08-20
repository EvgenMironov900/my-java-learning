/*
Нaзoвитe этoт фaйл 835 BufferedInputStreamDemo.java
// Использовaние буферизовaнного вводa.
*/

import java.io.*;
class BufferedInputStreamDemo {
  public static void main(String[] args) {
    String s = "Конструкция &cору; - символ aвторского прaвa, " +
                "но конструкция &cору - нет.\n";
    byte[] buf = s.getBytes();
    ByteArrayInputStream in = new ByteArrayInputStream(buf);
    int c;
    boolean marked = false;
    // Использовaть для упрaвления фaйлом оперaтор try с ресурсaми.
    try( BufferedInputStream f = new BufferedInputStream(in))
    {
      while((c = f.read()) != -1) {
        switch(c) {
          case '&':
            if(!marked) {
              f.mark(32);
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
              System.out.print ((char) c) ;
            break;
          case ' ':
            if (marked) {
              marked = false;
              f.reset () ;
              System.out.print ("&");
            } else
              System.out.print((char) c);
            break;
          default:
            if(!marked)
              System.out.print((char) c);
            break;
        }
      }
    } catch(IOException е) {
      System.out.println("Oшибкa вводa-выводa: "+ е);
    }
  }
}
/*
Рeзyльтaт paбoты пpoгpaммы:


*/

