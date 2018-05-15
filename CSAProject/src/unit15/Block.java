package unit15;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Block implements Locatable
{
	public final int	TOP_LEFT		= 0;
	public final int	TOP_MIDDLE		= 1;
	public final int	TOP_RIGHT		= 2;
	public final int	LEFT_MIDDLE		= 3;
	public final int	RIGHT_MIDDLE	= 4;
	public final int	BOTTOM_LEFT		= 5;
	public final int	BOTTOM_MIDDLE	= 6;
	public final int	BOTTOM_RIGHT	= 7;
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		setStuff(100,150,10,19);
		setColor(Color.BLACK);

	}
	public Block(int x, int y , int w, int h)
	{
		setStuff(x,y,w,h);
		setColor(Color.BLACK);
		
	}
	public Block(int x, int y , int w, int h, Color c)
	{
		setStuff(x,y,w,h);
		setColor(c);
	}
	//add other Block constructors - x , y , width, height, color
	
	
	
	
	
	public Rectangle getBounds() {
		return new Rectangle((int) xPos, (int) yPos, (int) width, (int) height);
	}
	
	public ArrayList<Rectangle> getFullBounds() {
		ArrayList<Rectangle> fullBounds = new ArrayList<Rectangle>(8);
		fullBounds.add(new Rectangle((int) getX(), (int) getY(), (int) (getWidth() / 5), (int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() / 5), (int) getY(), (int) (getWidth() * 3 / 5),
				(int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() * 4 / 5), (int) getY(), (int) (getWidth() / 5),
				(int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) getX(), (int) (getY() + getHeight() / 5), (int) (getWidth() / 5),
				(int) getHeight() * 3 / 5));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() * 4 / 5), (int) (getY() + getHeight() / 5),
				(int) (getWidth() / 5), (int) getHeight() * 3 / 5));
		fullBounds.add(new Rectangle((int) getX(), (int) (getY() + getHeight() * 4 / 5), (int) (getWidth() / 5),
				(int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() / 5), (int) (getY() + getHeight() * 4 / 5),
				(int) (getWidth() * 3 / 5), (int) (getHeight() / 5)));
		fullBounds.add(new Rectangle((int) (getX() + getWidth() * 4 / 5), (int) (getY() + getHeight() * 4 / 5),
				(int) (getWidth() / 5), (int) (getHeight() / 5)));
		return fullBounds;
	}
	
	
	
	
	
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
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());

   }
   
	public boolean equals(Object obj)
	{
		Block block = (Block) obj;
		


		return xPos==block.getX()&&yPos==block.getY()&&width==block.getWidth()&&height==block.getHeight()&&color.equals(block.getColor());
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
	
	public Color getColor()
	{
		return color;
	}
	public boolean didCollideLeft(Block b)
	{
		return this.getX()+this.getWidth()>=b.getX();
	}
	public boolean  didCollideRight(Block b)
	{
		return this.getX() <= b.getX()+b.getWidth();
	}
	public boolean didCollideUp(Block b)
	{
		return this.getY()+this.getHeight()>=b.getY();
	}
	public boolean didCollideDown(Block b)
	{
		return this.getY() <= b.getY()+b.getWidth();
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
		xPos = x;
		yPos = y;
	}
	@Override
	public void setX(int x) {
		// TODO Auto-generated method stub
		xPos = x;
	}
	@Override
	public void setY(int y) {
		// TODO Auto-generated method stub
		yPos = y;
	}
}