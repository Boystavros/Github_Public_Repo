PROJECT TITLE: Level Crossing Application
PURPOSE OF PROJECT:
This was my solution to a University Assignment question (from 1st Hons year of BSc Computing & IT) that 
demonstrates my understanding of selection, repetition, dialogue boxes, code reuse and composition in Java.

In this project we were asked to complete a class called Rocket. 
Once completed this class produces a simple graphical representation of a moving rocket in 
a BlueJay graphics window.

VERSION or DATE: Main 27/11/20
AUTHORS: Sacha Ponniah
--------------------------------------------------------------------------------------------------------------------------------------------------
Test code for use with the application:

//Creates simple shapes that will be components of the Rocket object
Triangle t = new Triangle();
Square s = new Square();
Circle c = new Circle();

//Creates and initialises a new Rocket object
Rocket r = new Rocket(t, s, c);

//Prompts user to enter a positive integer representing the launch speed for the rocket. 
//If suitable speed is entered, rocket counts down and then launches.
r.launch();
