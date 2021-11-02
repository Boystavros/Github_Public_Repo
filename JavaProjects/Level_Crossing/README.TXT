PROJECT TITLE: Level Crossing Application
PURPOSE OF PROJECT:
This was my solution to a University Assignment question (from 1st Hons year of BSc Computing & IT) that demonstrates my understanding of object orchestration and exception handling in Java.

This question involves completing a class called LevelCrossingController, instances of which coordinate the warning lights for a level crossing system to warn of the barriers coming down as a train approaches. 
First a single orange light is lit, and then a pair of red lights flash on and off together. This question only considers the lights on one side of the crossing and the motion of any train is outside its scope.

We were provided with the complete class Light in the supplied project and this class was not to be changed. We were asked to look at the code for this carefully and ensure that when writing methods we didn't 
repeat functionality already provided.

We were asked to write code exclusively in the LevelCrossingController class. This class decides which lights should be showing which colour at what point when a train approaches.

VERSION or DATE: Main 07/02/21
AUTHORS: Sacha Ponniah
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Test code for use with application:

//Creates three Light objects for use in level crossing system
Light topLeft = new Light();
Light topRight  = new Light();
Light bottom = new Light();

//Constructs and initialises new LevelCrossingController object
LevelCrossingController lcc = new LevelCrossingController(topLeft, topRight, bottom);

//Simulates train approaching
lcc.doTrainApproaching();
