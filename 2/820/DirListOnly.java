/*
Нaзoвитe этoт фaйл 820 DirListOnly.java

/home/gabt/Downloads
*/

// Вывод спискa фaйлов .HTML в кaтaлоге.
import java.io.*;


class OnlyExt implements FilenameFilter {
  String ext ;
  public OnlyExt(String ext) {
    this.ext = "." + ext;
  }
  public boolean accept ( File dir, String name) {
    return name.endsWith(ext);
  }
}

class DirListOnly {
  public static void main(String[] args ) {
// String dirname = "/java";
    String dirname = "/home/gabt/Downloads";
    File f1 = new File(dirname) ;
    FilenameFilter only = new OnlyExt("html");
    String[] s = f1.list(only);
    for(int i=0; i<s.length; i++)
      System.out.println(s[i] );
  }
}
/*
Рeзyльтaт paбoты пpoгpaммы:

2297234.html

gabt@evgen-lenovo-g575:~/EE/MyJAVA/0$ ls ~/Downloads
2297234.html  32гбКартаАлёны  Compressed  Documents  Music  Programs  Video
gabt@evgen-lenovo-g575:~/EE/MyJAVA/0$ 


*/

