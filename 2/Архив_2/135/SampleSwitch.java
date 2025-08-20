/*
Простой пример применения оператора switch
Назовите этот файл 135 SampleSwitch.java
*/

class SampleSwitch {
  public static void main(String[] args) {
    for (int i=0; i<6; i++)
      switch (i) {
        case 0:
          System.out.println("i равно нулю.");
          break;
        case 1:
          System.out.println("i равно одному.");
          break;
        case 2:
          System.out.println("i равно двум.");
          break;
        case 3:
          System.out.println("i равно трем.");
          break;
        default:
          System.out.println("i больше трех.");
      }
  }
}

/*
Результат работы программы:
i равно нулю.
i равно одному.
i равно двум.
i равно трем.
i больше трех.
i больше трех.
*/

