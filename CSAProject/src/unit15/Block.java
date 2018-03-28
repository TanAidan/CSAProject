package unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}
	public Block(int x, int y , int w, int h)
	{
		setStuff(x,y,w,h);
		
	}
	public Block(int x, int y , int w, int h, Color c)
	{
		setStuff(x,y,w,h);
		setColor(c);
	}
	//add other Block constructors - x , y , width, height, color
	
	
	
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   public void setStuff(int x, int y, int w, int h)
   {
	   xPos = x;
	   yPos = y;
	   width = w;
	   height = h;
   }

   public void setColor(Color col)
   {
	   color = col;

   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{




		return false;
	}   
	public int getX()
	{
		return xPos;
	}
	public int getY()
	{
		return yPos;
	}
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}

   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString()
	{
		return "x:"+xPos+" y:"+yPos+" width:"+width+" height:"+height+" color:"+ color;
	}
	@Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		
	}
}