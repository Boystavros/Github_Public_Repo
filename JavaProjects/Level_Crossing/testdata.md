<h4> The following test code can be used to test the application. Descriptions of methods are included as comments accompanying the code: </h4>

Create three Light objects for use in level crossing system:

```java
Light topLeft = new Light();
Light topRight  = new Light();
Light bottom = new Light();
```

Construct and initialise a new LevelCrossingController object:

```java
LevelCrossingController lcc = new LevelCrossingController(topLeft, topRight, bottom);
```

Simulate a train approaching:

```java
lcc.doTrainApproaching();
```