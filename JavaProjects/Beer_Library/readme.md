<h1>Beer Library<h1>
  <h2>PURPOSE OF PROJECT:<h2> 

  This was my solution to a University Assignment question (from 1st Hons year of BSc Computing & IT).

  The purpose of this project was to model a scenario of our choice with a small application that makes use of a map and provides the user with the       ability to store, manipulate and extract data.

  We were encouraged to express ourselves and to choose an area that interested us, but we had to keep within the specification given below.

  It was up to us what scenario we invented, the type of map we chose (sorted or unsorted), and the types of the map keys and values, as long as the       following conditions were met:

  -  The keys had to be of type String or Integer.
  - The value types had to be either a List or a Set from the Collections Framework. The values could not be references to individual objects.

  My solution is decribed below:

| --- | :--- |
| General scenario | A ‘beer library’ to allow a specialist off-licence to keep a record of the beers they stock using an unsorted map, where each key                        of the map is a String, representing the name of a brewery, and the values are sets of strings, where each String in this Set                            represents a beer produced by that brewery. |
|--------------------------- | ------------------------------------|
| Type of key (String or integer) |	String |
| Type of value (must be from Collections framework) |	Set of Strings |
| Type of map (sorted or unsorted) |	unsorted |

<h3> Date: 09/04/21 <h3>
<h3> Author: Sacha Ponniah <h3>

The following test code can be used to test the application.

//Create new BeerLibrary and assign it to bl1
BeerLibrary bl1 = new BeerLibrary();

//test populateBreweries()
bl1.populateBreweries();

//test printMap()
bl1.printMap();

//test printMapValue()
bl1.printMapValue("Tempest");//brewery is in beerLibrary
bl1.printMapValue("Carlsberg");//brewery is not in beerLibrary

//test data for addMapEntry()
Set<String> dryGateBeers = new HashSet<>();
dryGateBeers.add("Gladeye");
dryGateBeers.add("DiscoForkliftTruck");
dryGateBeers.add("Orinoco");
//test addMapEntry()
bl1.addMapEntry("Drygate", dryGateBeers);
bl1.printMap();

//test deletEntry()
bl1.deleteEntry("Tempest");//brewery is in beerLibrary
bl1.printMap();
bl1.deleteEntry("Carlsberg");//brewery is not in beerLibrary
bl1.printMap();

//test addToValueAtKey(aBrewery, aBeer)
bl1.populateBreweries();//to re-populate library
bl1.addToValueAtKey("Tempest", "Elemental");
bl1.printMapValue("Tempest");

//test deleteFromValueAtKey(aBrewery, aBeer)
bl1.deleteFromValueAtKey("Tempest", "Mexicake");
bl1.printMapValue("Tempest");
