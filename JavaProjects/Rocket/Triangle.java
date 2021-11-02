import ou.*;
/**
 * The class Triangle defines a shape with the characteristics of an isoceles triangle.
 *
 * @author M250 Course Team
 * @version 1.0
 */
public class Triangle extends OUAnimatedObject
{
/* Instance variables */

   private OUColour colour;
   private int xPos;
   private int yPos;
   private int width;
   private int height;
   
   /**
    * Constructor for objects of class Triangle with the default characteristics.
    */
   public Triangle()
   {
      this.colour = OUColour.RED;
      this.xPos = 0;
      this.yPos = 0;
      this.width = 20;
      this.height = 20;
   }

/* Instance methods */     
     
   /**
    * Sets the colour of the receiver to the value of the argument aColour.
    */
   public void setColour (OUColour aColour)
   {
      this.colour = aColour;
      this.update();
   }
   
   /**
    * Returns the colour of the receiver.
    */
   public OUColour getColour ()
   {
      return this.colour;
   }
   
   /**
    * Sets the horizontal position of the receiver to the value of the argument x.
    */
   public void setXPos(int x)
   {
      this.xPos = x;
      this.update();
   }
   
   /**
    * Returns the horizontal position of the receiver.
    */
   public int getXPos()
   {
      return this.xPos;
   }
   
   /**
    * Sets the vertical position of the receiver to the value of the argument y.
    */
   public void setYPos(int y)
   {
      this.yPos = y;
      this.update();
   }
   
   /**
    * Returns the vertical position of the receiver.
    */
   public int getYPos()
   {
      return this.yPos;
   }
   
   /**
    * Sets the width of the receiver to the value of the argument aWidth.
    */
   public void setWidth(int aWidth)
   {
      this.width = aWidth;
      this.update();
   }
   
   /**
    * Returns the width of the receiver.
    */
   public int getWidth()
   {
      return this.width;
   }
   
   /**
    * Sets the height of the receiver to the value of the argument aHeight.
    */
   public void setHeight(int aHeight)
   {
      this.height = aHeight;
      this.update();
   }
   
   /**
    * Returns the height of the receiver.
    */
   public int getHeight()
   {
      return this.height;
   }
   
   /**
    * Returns a string representation of the receiver.
    */
   public String toString()
   {
      return "An instance of class "+ this.getClass().getName() 
             + ": position (" + this.getXPos() + ", " + this.getYPos()
             + "), width " + this.getWidth() + ", height " + this.getHeight()
             + ", colour " + this.getColour();
   }
}
