import ou.*;
/**
 * LevelCrossingController for TMA03Q1.
 * 
 * @author Sacha Ponniah
 * @version 07 February 2021
 */
public class LevelCrossingController
{  
   public static final int MIN_REPEATS = 4;
   
   private Light topLeft;
   private Light topRight;
   private Light bottom;
   
   private boolean trainComing;
   
   //Takes the values 0, 1, 2 or 3 and dictates the pattern of lights.
   private int state;
  
   /**
    * Constructor for objects of class LevelCrossingController.
    * @param topLeft, topRight, bottom are Light objects
    */
   public LevelCrossingController(Light firstLight, Light secondLight, Light thirdLight)
   {
      this.topLeft = firstLight;
      this.topRight = secondLight;
      this.bottom = thirdLight;
      this.setPositions();
      this.state = 0;
      this.trainComing = false;
      this.colourAllLights();
   }
   
   /**
    * @return trainComing
    */
   public boolean getTrainComing()
   {
       return trainComing;
   }

   /**
    * @param trainComing
    * setter for trainComing
    */
   public void setTrainComing(boolean trainComing)
   {
       this.trainComing = trainComing;
   }
      
   /**
    * Sets the positions of the lights.
    */
   private void setPositions() 
   {
      this.bottom.setXPos(100);
      this.bottom.setYPos(200);      
      this.topLeft.setXPos(0);
      this.topLeft.setYPos(100);      
      this.topRight.setXPos(200);
      this.topRight.setYPos(100);
   }   
  
   /**
    * Find out how many times red lights should flash at the crossing.
    * Simulates length of train at crossing.
    */   
   public static int findNumRepeats()
   {
       int repeats = 0;
       while (repeats < LevelCrossingController.MIN_REPEATS)
       {
          String timesAsString =              
            OUDialog.request("How many times should the red lights"
            + " flash? ("
            + LevelCrossingController.MIN_REPEATS
            + " or over times)");
                 
          if (timesAsString != null)
          {
             try
             {
                repeats = Integer.parseInt(timesAsString);
                if (repeats < LevelCrossingController.MIN_REPEATS)
                {
                   OUDialog.alert("Repeats number is too low. Must be "
                      + LevelCrossingController.MIN_REPEATS
                      + " or more.");
                }
             }
             catch(NumberFormatException anException)
             {
                OUDialog.alert("Number entered must be an integer. " 
                                + anException);
             }
          }
          else
          {
             //resets value of repeats for cases where a lower number was entered before pressing cancel
             repeats = 0;
             return repeats;
          }
       }
       return repeats;
   }
 
   /**
    * Causes execution to pause for a number of milliseconds.
    */
    public static void delay(int time)
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
    
   /**
    * Sends setColour message to the light specified to set its colour
    * to the OUColour specified. 
    */
   public void colourLight(Light aLight, OUColour aColour)
   {
      aLight.setColour(aColour);
   }
   
   /**
    * If trainComing is False, sets receiver's state to zero. 
    * Otherwise changes receiver's state based on state's 
    * value when message received.
    */
   public void changeState()
   {
      if (this.trainComing == true)
      {
         switch(state)
         {
            case 0:
               this.state = 1;
               break;
            case 1:
               this.state = 2;
               break;
            case 2:
               this.state = 3;
               break;
            case 3:
               this.state = 2;
               break;
         }
      }
      else
      {
         this.state = 0;
      }
   }
   
   /**
    * Sets the colours of receiver's lights based on 
    * the value of state
    */
   public void colourAllLights()
   {
      switch(state)
      {
         case 0:
            this.colourLight(this.bottom, OUColour.BLACK);
            this.colourLight(this.topLeft, OUColour.BLACK);
            this.colourLight(this.topRight, OUColour.BLACK);
            break;
         case 1:
            this.colourLight(this.bottom, OUColour.ORANGE);
            this.colourLight(this.topLeft, OUColour.BLACK);
            this.colourLight(this.topRight, OUColour.BLACK);
            break;
         case 2:
            this.colourLight(this.bottom, OUColour.BLACK);
            this.colourLight(this.topLeft, OUColour.RED);
            this.colourLight(this.topRight, OUColour.BLACK);
            break;
         case 3:
            this.colourLight(this.bottom, OUColour.BLACK);
            this.colourLight(this.topLeft, OUColour.BLACK);
            this.colourLight(this.topRight, OUColour.RED);
            break;
      }
   }
   
   /**
    * Helper method that sends changeState() and colourAllLights() 
    * messages to receiver.
    */
   private void stateAndColour()
   {
      this.changeState();
      this.colourAllLights();
   }
   
   /**
    * Prints messages "Train Approaching", "Barrier lowered", then flashes 
    * lights for number of times specified by user input or thew minimum 
    * permitted number,before printing "Barrier raised" message and 
    * switching lights off.
    */
   public void doTrainApproaching()
   {
      int delayTime = 600;
            
      //initialises lights to off and state to 0
      this.setTrainComing(false);
      this.stateAndColour();
      //Starts train approaching sequence
      System.out.println("Train approaching");
      this.setTrainComing(true);
      //Displays orange light while awaiting user input
      this.stateAndColour();
      System.out.println("Barrier lowered");
      int numRepeats = this.findNumRepeats();
      for(int i = 0; i < numRepeats; i++)
      {
         this.stateAndColour();
         this.delay(delayTime);
      }
      //Re-initialises lights to off and state to 0
      this.setTrainComing(false);
      this.stateAndColour();
      System.out.println("Barrier raised");
            
   }
}


