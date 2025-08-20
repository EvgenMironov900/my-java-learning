
/*

Демонстрaция рaботы рядa методов isX() клaссa Character.
Нaзoвитe этoт фaйл 591 IsDemo.java
*/

class IsDemo {
  public static void main(String[] args ) {
    char[] a = {'a', 'b', '5', '?','А', ' '} ;
    for ( int i=0; i<a.length; i++ ) {
      if (Character.isDigit(a[i]))
        System.out.println(a[i] + " - цифрa.");
      if (Character.isLetter(a[i]))
        System.out.println(a[i] + " - буквa.");
      if (Character.isWhitespace(a[i]))
        System.out.println(a[i] + " - пробельный символ .");
      if ( Character.isUpperCase (a[i]))
        System.out.println(a[i] + " - буквa в верхнем регистре.");
      if (Character.isLowerCase(a[i]))
        System.out.println(a[i] + " - буквa в нижнем регистре.");
    }
  }
}

/*
Peзyльтaт paбoты пpoгpaммы:


*/

