/*
Проверка, является ли число простым
Назовите этот файл 145 FindPrime.java
*/

class FindPrime {
  public static void main(String[] args) {
    int num;
    boolean isPrime;
    num = 14;
    if(num < 2) isPrime = false;
    else isPrime = true;
    for (int i=2; i<=num/i; i++) {
      if((num % i) == 0) {
        isPrime = false;
        break;
      }
    }
    if(isPrime) System.out.println(num + " являeтcя простым");
    else System.out.println(num + " не является простым");
  }
}

/*
Результат работы программы:

14 не является простым
*/

