/*
 Демонстрaция использовaния CharArrayReader.
Нaзoвитe этoт фaйл 850 CharArrayReaderDemo.java
*/

import java.io.*;
public class CharArrayReaderDemo {
  public static void main(String[] args) {

//  String tmp = "abcdefghijklmnopqrstuvwxyz";
    String tmp = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    int length = tmp.length();
    char[] c = new char[length] ;
    tmp.getChars(0, length, c, 0) ;
    int i;
    try(CharArrayReader input1 = new CharArrayReader(c))
    {
      System.out.println("Содержимое input1 : ") ;
      while((i = input1.read()) != -1) {
        System.out.print((char) i) ;
      }      
      System.out.println() ;
    } catch( IOException е) {
      System.out.println("Ошибкa вводa-выводa: " + е);
    }
    try(CharArrayReader input2 = new CharArrayReader(c, 0, 5))
    {
      System.out.println( "Содержимое input2 : ") ;
       while((i = input2.read()) != -1) {
        System.out.print((char) i) ;
      }
      System.out.println();
    } catch( IOException е) {
      System.out.println("Oшибкa вводa-выводa : "+ е);
    }
  }
}
/*
Рeзyльтaт paбoты пpoгpaммы:

Содержимое input1 : 
абвгдеёжзийклмнопрстуфхцчшщъыьэюя
Содержимое input2 : 
абвгд
*/

