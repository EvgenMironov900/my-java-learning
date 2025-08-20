
/*

Назoвитe этoт файл 247/mypack AccountBalance.java
*/

// Простой пакет.
package mypack;
class Balance {
  String name;
  double bal;
  Balance(String n, double b) {
    name = n;
    bal = b;
  }
  void show() {
    if(bal<0)
      System.out.print("--> ");
    System.out.println(name + ": $" + bal);
  }
}
class AccountBalance {
  public static void main(String[] args) {
    Balance[] current = new Balance[3];
    current[0] = new Balance("K. J. Fielding", 123.23);
    current[1] = new Balance("Will Tell", 157.02);
    current[2] = new Balance("Tom Jackson", -12.33);
    for(int i=0; i<3; i++) current[i].show();
  }
}

/*
Рeзультат рабoты прoграммы:

K. J. Fielding: $123.23
Will Tell: $157.02
--> Tom Jackson: $-12.33
*/
/*
15.04.25
evgen@HP:~$ cd ~/EE/MyJAVA/2/247/mypack
evgen@HP:~/EE/MyJAVA/2/247/mypack$ javac AccountBalance.java
evgen@HP:~/EE/MyJAVA/2/247/mypack$ cd ../
evgen@HP:~/EE/MyJAVA/2/247$ java mypack.AccountBalance
K. J. Fielding: $123.23
Will Tell: $157.02
--> Tom Jackson: $-12.33
evgen@HP:~/EE/MyJAVA/2/247$ 

*/
