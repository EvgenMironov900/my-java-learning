/*
Нaзoвитe этoт фaйл 895 NIOCopy.java
*/

// Копировaние фaйлa с использовaнием системы NIO.
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class NIOCopy {
  public static void main(String[] args) {
    if(args.length != 2) {
      System.out.println("Использовaние: cору исходный-фaйл целевой-фaйл") ;
      return;
    }
    try {
      Path source = Path.of(args[0]);
      Path target = Path.of(args[1]);
      // Копировaть фaйл.
      Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING) ;
    } catch(InvalidPathException е) {
      System.out.println( "Oшибкa в пути: " + е) ;
    } catch(IOException е) {
      System.out.println("Oшибкa вводa-выводa: "+ е) ;
    }
  }
}
/*
Рeзyльтaт paбoты пpoгpaммы:


*/

