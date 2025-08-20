import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FindResults {
  static String spath = "Раб"; // Зададим имя корневой папки
  static String tipfajla = ".java";  // Нужны файлы с таким расширением
  static String iskomoe = "Результат работы программы"; // После этого д.б. минимум 4 строки
  static Boolean vsehorosho = true;
  public static void FF(Path fpath) {
    String sfpath = fpath.toString();
    String sbuf1 = "льт"; //Точное значение для поиска подстроки
    if ((sfpath.length() > spath.length() + tipfajla.length()) & sfpath.endsWith(tipfajla)) {
      int kolstrok = 0;
      try (FileReader fr = new FileReader(sfpath)) {
        int c;
        String sbuf = "";
        // Прочитaть и обработать содержимое фaйлa.
        while((c = fr.read()) != -1) {
          sbuf += Character.toString(c);
          if ((char) c == '\n') {
            if (kolstrok == 0) {
              if ((sbuf.length() > iskomoe.length()) & sbuf.startsWith(sbuf1, 4)) kolstrok++;
            }
            else kolstrok++;
            sbuf = "";
          }
        }
        if (kolstrok<5) {
          sfpath = sfpath.substring(spath.length()+1);
          vsehorosho = false;
          if (kolstrok==0)
            System.out.println(sfpath + " Комментария нет");
          else
            System.out.println(sfpath + " Подозрительно короткий комментарий");
        }
      } catch(IOException е) {
        System.out.println( "Oшибкa вводa-выводa: " + е) ;
      }
    }
  }
  public static void main(String[] args) throws IOException {
    // Указываем начальную папку для поиска
    Path startDirectory = Paths.get(spath);
    Files.walk(startDirectory).forEach(path -> FF(path));
    if (vsehorosho) System.out.println("Всё хорошо!");
  }
}

