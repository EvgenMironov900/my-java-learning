/*
 Демонстрaция использовaния InetAddress.
Нaзoвитe этoт фaйл 911 InetAddressTest.java
*/

import java.net.*;
class InetAddressTest {
	public static void main(String[] args) throws UnknownHostException {
  InetAddress Address = InetAddress.getLocalHost();
  System.out.println(Address) ;
  Address = InetAddress.getByName("www.HerbSchildt.com");
  System.out.println(Address);
  InetAddress[] SW = InetAddress.getAllByName( "www.nba.com") ;
  for(int i=0; i<SW.length; i++)
    System.out.println(SW[i] );
  }
}
/*
Рeзyльтaт paбoты пpoгpaммы:

HP/127.0.1.1
www.HerbSchildt.com/216.92.65.4
www.nba.com/2.18.197.104
www.nba.com/2a02:26f0:9500:138d:0:0:0:1f51
www.nba.com/2a02:26f0:9500:139f:0:0:0:1f51
*/

