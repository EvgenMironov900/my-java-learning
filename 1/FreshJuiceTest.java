/*
cd /home/gabt/Рабочий\ стол/MyJAVA/1
*/

class FreshJuice {

//   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
   enum FreshJuiceSize{ малый, Средний, бол1 }
   FreshJuiceSize size;
}

public class FreshJuiceTest {

   public static void main(String args[]){
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.Средний;
      System.out.println("Размер: " + juice.size);
 
      juice.size = FreshJuice.FreshJuiceSize.малый;
      System.out.println("Размер: " + juice.size);
 
      juice.size = FreshJuice.FreshJuiceSize.бол1;
      System.out.println("Размер: " + juice.size);
   }
}
/* Результат работы программы:
Размер: Средний
Размер: малый
Размер: бол1
*/

