
/*

Назoвитe этoт файл AccountBalance247.java
*/

// Простой пакет.
package mypack0;
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
class AccountBalance247 {
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

gabt@evgen-lenovo-g575:~/EE/MyJAVA/2$ cd ~/EE/MyJAVA/2/mypack0
gabt@evgen-lenovo-g575:~/EE/MyJAVA/2/mypack0$ javac AccountBalance247.java
gabt@evgen-lenovo-g575:~/EE/MyJAVA/2/mypack0$ cd ../
gabt@evgen-lenovo-g575:~/EE/MyJAVA/2$ java mypack0.AccountBalance247
K. J. Fielding: $123.23
Will Tell: $157.02
--> Tom Jackson: $-12.33




*/
