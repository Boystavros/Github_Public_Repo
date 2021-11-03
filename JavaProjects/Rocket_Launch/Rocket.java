import ou.*;
/**
 * Class Rocket allows a representation of a rocket to be created in the Shapes
 * Window, and for it to move up the screen.
 * 
 * 
 * @author (Sacha Ponniah, K1353583) 
 * @version (27 November 2020)
 */
public class Rocket
{   
   private Triangle nose;      // represents the rocket's nose cone
   private Square body;        // represents the rocket's body
   private Circle jet;         // represents the blast from the rocket's engine

   /**
    * Constructor for objects of class Rocket
    */
   public Rocket(Triangle t, Square s, Circle c)
   {
      //first, we store references to the workspace shape objects
      this.nose = t;
      this.body = s; 
      this.jet = c;    

      //sets the initial positions of the nose.
      //The other parts need to be set relative to these positions.
      this.nose.setXPos(50);
      this.nose.setYPos(300);

      //sets the body relative to the nose, using the helper methods
      this.body.setXPos(getBodyXPos());
      this.body.setYPos(getBodyYPos());      

      //The jet is invisible to begin with, because it uses
      //the background colour of WHITE, but you can use BLACK
      //to help you see it while testing
      this.jet.setColour(OUColour.BLACK); 
      this.jet.setDiameter(10);           

      //sets the jet position relative to the body, using the helper methods
      this.jet.setXPos(getJetXPos()); 
      this.jet.setYPos(getJetYPos()); 
   }

   /**
    * Returns the horizontal position of the body
    */
   private int getBodyXPos()
   {
      return this.nose.getXPos();
   }

   /**
    * Returns the vertical position of the body
    */
   private int getBodyYPos()
   {
      return this.nose.getYPos() + this.nose.getHeight();
   }
   
   /**
    * Returns the horizontal position of the jet
    */
   private int getJetXPos()
   {
      return this.getBodyXPos() 
             + (this.body.getLength() / 2) 
             - (this.jet.getDiameter() / 2);
   }

   /**
    * Returns the vertical position of the jet
    */
   private int getJetYPos()
   {
      return this.getBodyYPos() + this.body.getLength();
   }

   /**
    * Moves the nose of the receiver 
    * by anInt units.
    * Moves other rocket components relative to the 
    * position of the nose.
    */
   public void moveRocketBy(int anInt)
   {
      this.nose.setYPos(this.nose.getYPos() - anInt);
      this.body.setYPos(getBodyYPos());
      this.jet.setYPos(getJetYPos());
   }

   /**
    * Sets the diameter of the receiver's jet to 
    * 6, resets its position and sets its
    * colour to red.
    */
   public void pulse1()
   {
      this.jet.setDiameter(6);
      this.jet.setXPos(getJetXPos());
      this.jet.setColour(OUColour.RED);
   }

   /**
    * Sets the diameter of the receiver's jet to 
    * 12, resets its position and sets 
    * its colour to orange.
    */      
   public void pulse2()
   {
      this.jet.setDiameter(12);
      this.jet.setXPos(getJetXPos());
      this.jet.setColour(OUColour.ORANGE);    
   }

   /**
    * Sets the diameter of the receiver's jet to 
    * 24, resets its position and sets 
    * its colour to red.
    */    
   public void pulse3()
   {
      this.jet.setDiameter(24);
      this.jet.setXPos(getJetXPos());
      this.jet.setColour(OUColour.RED);      
   }

   /**
    * Simulates the ignition of the rocket's jets
    */
   public void ignition()
   {
      for (int flare = 0; flare < 5; flare++)
      {
         this.pulse1();
         this.delay(200);
         this.pulse2();
         this.delay(200);
         this.pulse3();
         this.delay(200);
      }
   }

   /**
    * Moves the entire rocket by speed units upwards, repeated 
    * 100 times, animating the jet as it goes.
    */
   public void animateRocket(int speed)
   {
      for (int i = 1; i < 101; i++)
      {
         if (i % 4 == 1)
         {
            this.pulse1();
            this.delay(200);         
         }
         else if (i % 4 == 2)
         {
            this.pulse2();
            this.delay(200);
         }
         else if (i % 4 == 3)
         {
            this.pulse3();
            this.delay(200);         
         }
         else //(i % 4 == 0)
         {
            this.moveRocketBy(speed);         
         }
         
      }   
   }

   /**
    * Prompts the user to enter the number of units they want the  
    * rocket to move upwards at a time (speed)
    * 
    * If the number of units provided would eventually cause the tip of 
    * the nose to go past the top of the Graphical Display, the user 
    * is informed via a dialogue box that the rocket will not launch.  
    * 
    * Otherwise the rocket launches as required. 
    */
   public void launch()
   {
      String inputString = OUDialog.request("Enter a positive number to set the rocket's launch speed");
      int speed = Integer.parseInt(inputString);
      
      if ((this.nose.getYPos() - speed*25) < 0)
      {
         OUDialog.alert("Rocket cannot launch as number entered is too large!");
      }
      else
      {
         this.ignition();
         this.animateRocket(speed);
      }
   }

   /**
    * Causes execution to pause by time number of milliseconds
    */
   public void delay(int time)
   {
      try
      {
         Thread.sleep(time); 
      }
      catch (Exception e)
      {
         System.out.println(e);
      } 
   }
}   
