Light topLeft = new Light();
Light topRight  = new Light();
Light bottom = new Light();

// create a level crossing light system
LevelCrossingController lcc = new LevelCrossingController(topLeft, topRight, bottom);
lcc.doTrainApproaching();

//part a
LevelCrossingController lcc = new LevelCrossingController();
lcc.topLeft = topLeft;
lcc.colourLight(topLeft, OUColour.ORANGE);
lcc.colourLight(topRight, OUColour.ORANGE);
lcc.colourLight(bottom, OUColour.ORANGE);

//part c
lcc.setTrainComing(true);
lcc.changeState();
lcc.colourAllLights();

//part d
lcc.findNumRepeats();
lcc.doTrainApproaching();
