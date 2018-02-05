package unit1;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      upperBody(window);
      lowerBody(window);
      
      //call other methods
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillOval(300, 100, 200, 100);
      window.setColor(Color.GREEN);
      window.fillOval(350, 125, 20, 20);
      window.fillOval(430, 125, 20, 20);
      window.setColor(Color.BLACK);
      window.fillOval(390, 150, 20, 10);
      window.setColor(Color.RED);
      window.drawArc(350, 135, 100, 40, -150, 120);
      //window.drawArc(x, y, width, height, startAngle, arcAngle);
   }

   public void upperBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.YELLOW);
	   window.drawRect(340, 220, 120, 70);
	   window.setColor(Color.BLUE);
	   window.fillRect(340, 220, 120, 70);
	   window.setColor(Color.BLACK);
	   window.drawLine(260,190, 340, 220);
	   window.drawLine(460, 220, 540, 190);
   }

   public void lowerBody( Graphics window )
   {

		//add more code here
	   window.setColor(Color.YELLOW);
	   window.drawRect(340, 310, 120, 70);
	   window.setColor(Color.GRAY);
	   window.fillRect(340, 310, 120, 70);
	   window.setColor(Color.BLACK);
	   window.drawLine(340,380,260,460);
	   window.drawLine(460, 380, 540, 460);

   }
}