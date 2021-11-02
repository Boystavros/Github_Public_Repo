import ou.*;
/**
 * The class Circle defines a shape with the characteristics of a circle.
 *
 * @author M250 Course Team
 * @version 1.0
 */
 
public class Circle extends OUAnimatedObject
{
/* Instance variables */

   private int diameter;
   private OUColour colour;
   private int xPos;
   private int yPos;
   
   /**
    * Constructor for objects of class Circle with the default characteristics.
    */
   public Circle()
   {
      this.diameter = 20;
      this.colour = OUColour.BLUE;
      this.xPos = 0;
      this.yPos = 0;
   }
   
   /* Instance methods */    
   
   /**
    * Sets the diameter of the receiver to the value of the argument aDiameter
    */
   public void setDiameter(int aDiameter)
   {
      this.diameter = aDiameter;
      this.update();
   }
   
   /**
    * Returns the diameter of the receiver.
    */
   public int getDiameter()
   {
      return this.diameter;
   }
   
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
    * Returns a string representation of the receiver.
    */
   public String toString()
   {
      return "An instance of class "+ this.getClass().getName() 
             + ": position (" + this.getXPos() + ", " + this.getYPos() 
             + "), diameter " + this.getDiameter() + ", colour " + this.getColour();
   }
}
