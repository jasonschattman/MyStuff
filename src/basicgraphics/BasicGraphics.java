
package basicgraphics;

import java.awt.*; //needed for graphics
import javax.swing.*; //needed for graphics


public class BasicGraphics extends JFrame {
 
    //Draws the screen once
    public void paint( Graphics g ) { //g is a graphics-drawing object. 
                                      //Think of g as a paint brush that can have any colour  
        
        //Paint the background of the window
        g.setColor(Color.white); 
        g.fillRect(0, 0, 1000, 1000); 

        //Draw some stuff on top of the blue background
        g.setColor(Color.red);
        g.fillRect(100, 100, 80, 40); //draws a yellow rectangle with upper-left corner (100,100) and size 80x40
        g.drawRect(200, 200, 80, 40); //what's the difference between fillRect and drawRect?
        
        g.setColor( Color.blue );
        g.drawLine(300, 100, 700, 200); //draws a line from (300,100) to (700, 200)
        
        g.setColor( Color.black);
        g.fillRect(500,500,1,1);
    }
    
    
    public static void main(String[] args) {
        
        BasicGraphics myWindow = new BasicGraphics();

        myWindow.setTitle("My First Graphics Program");
        myWindow.setSize(1000, 1000);
        myWindow.setBackground(Color.white);  //doesn't work in Windows NetBeans 7.3 due to a bug
        myWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
        myWindow.setVisible(true); // The most important line! This causes the paint() method above to be called
    }
}
