/*
Применение строки для управления оператором switch
Назовите этот файл 138 StringSwitch.java
*/
//  .
class StringSwitch {
  public static void main(String[] args) {
    String str = "two" ;
    switch (str) {
      case "one":
        System.out.println("oдин");
        break;
      case "two":
        System.out.println("двa");
        break;
      case "three":
        System.out.println("тpи");
        break;
      default:
        System.out.println("coвnaдeний нет");
        break; //хз зачем
    }
  }
}

/*
Результат работы программы:
двa
*/

