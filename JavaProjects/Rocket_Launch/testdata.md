<h4> The following test code can be used to test the application. Descriptions of methods are included as comments accompanying the code: </h4>

Creates simple shapes that will be components of the Rocket object:

```java
Triangle t = new Triangle();
Square s = new Square();
Circle c = new Circle();
```

Create and initialise a new Rocket object:

```java
Rocket r = new Rocket(t, s, c);
```

Prompt user to enter a positive integer representing the launch speed for the rocket. If suitable speed is entered, rocket counts down and then launches:

```java
r.launch();
```