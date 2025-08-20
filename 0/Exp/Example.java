/*
Простая программа на Java .
Назовите этот файл 066 Example.java
*/
// public class Example66 {
class Example {
  public static void main (String[] args) {
    int символ;
    String строка;
    // 1
    символ = 'ш';
    строка = "Привет";
    строка += (char) символ; // Теперь строка будет "Приветш"
    System.out.println ("Метод 1, строка = " + строка);

    //2
    символ = 'щ';
    строка = "Привет";
    строка = строка.concat(String.valueOf((char) символ)); // Строка станет "Приветщ"
    System.out.println ("Метод 2, строка = " + строка);

    //3
    символ = 'ъ';
    строка = "Привет";
    строка = строка + Character.toString((char)символ); // Строка станет "Приветъ"
    System.out.println ("Метод 3, строка = " + строка);

  //    System.out.println ("Простая программа на языке Java.");
  }
}

/*
Рeзyльтaт paбoты пpoгpaммы:

Простая программа на языке Java.
*/

