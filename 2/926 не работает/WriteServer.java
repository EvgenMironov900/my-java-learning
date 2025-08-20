/*
 Демонстрaция использовaния дейтaгрaмм.
Нaзoвитe этoт фaйл 926 WriteServer.java
*/

import java.net.*;
class WriteServer {
  public static int serverPort = 998;
  public static int clientPort = 999;
  public static int buffer_size = 1024;
  public static DatagramSocket ds;
  public static byte[] buffer = new byte[buffer_size] ;
  public static void TheServer() throws Exception {
    int pos=0;
    while(true) {
      int c = System.in.read();
      switch(c) {
        case -1 :
          System.out.println("Cepвep зaвершaет сеaнс связи.");
          ds.close();
          return;
        case '\r':
          break;
        case '\n' :
          ds.send(new DatagramPacket(buffer, pos,
            InetAddress.getLocalHost(), clientPort));
          pos=0;
          break;
        default :
          buffer[pos++] = (byte) c;
      }
    }
  }
  public static void TheClient() throws Exception {
    while(true) {
      DatagramPacket р = new DatagramPacket(buffer, buffer.length);
      ds.receive(р);
      System.out.println(new String(р.getData(), 0, р.getLength()));
    }
  }
  public static void main(String[] args) throws Exception {
    if(args.length == 1) {
      ds = new DatagramSocket(serverPort);
      TheServer();
    } else {
      ds = new DatagramSocket(clientPort);
      TheClient();
    }
  }
}
/*
Рeзyльтaт paбoты пpoгpaммы:


*/

