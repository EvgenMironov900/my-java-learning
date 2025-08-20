
/*

 Дeмoнcтpaция иcпoльзoвaния append().
Нaзoвитe этoт фaйл 564 appendDemo.java
*/

class appendDemo {
  public static void main (String[] args) {
    String s;
    int a = 42;
    StringBuffer sb = new StringBuffer(40);
    s = sb.append("a = "). append(a).append("!").toString();
    System.out.println(s) ;
  }
}

/*
Peзyльтaт paбoты пpoгpaммы:

a = 42!
*/

