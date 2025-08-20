import javax.swing.*;
public class Sexample {
  public static void main(String args[]) {
        JFrame a = new JFrame("example");
        JButton b = new JButton("click me");
        b.setBounds(40,90,85,20);
        a.add(b);
        a.setSize(300,300);
        a.setLayout(null);
        a.setVisible(true);
    }
}
/*
cd /home/evgen/EE/MyJAVA/4
javac Sexample.java

Результат:
evgen@HP:~/EE/MyJAVA/4$ java Sexample
Exception in thread "main" java.awt.HeadlessException: 
No X11 DISPLAY variable was set,
or no headful library support was found,
but this program performed an operation which requires it,

	at java.desktop/java.awt.GraphicsEnvironment.checkHeadless(GraphicsEnvironment.java:164)
	at java.desktop/java.awt.Window.<init>(Window.java:553)
	at java.desktop/java.awt.Frame.<init>(Frame.java:428)
	at java.desktop/javax.swing.JFrame.<init>(JFrame.java:224)
	at Sexample.main(Sexample.java:4)
evgen@HP:~/EE/MyJAVA/4$ 


*/



