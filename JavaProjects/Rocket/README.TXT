//Q1(a)
Triangle t = new Triangle();
Square s = new Square();
Circle c = new Circle();

c.setColour(OUColour.BLACK); //for testing we can make the jet visible

Rocket r = new Rocket(t, s, c);

//Q1(b)
r.moveRocketBy(100);
r.moveRocketBy(200);

//Q1(c)
r.pulse1();
r.pulse2();
r.pulse3();

//Q1(d)
Rocket r = new Rocket(t, s, c);
r.ignition();

//Q1(e)
Rocket r = new Rocket(t, s, c);
r.animateRocket(10);

//Q1(f)
Rocket r = new Rocket(t, s, c);
r.launch();
