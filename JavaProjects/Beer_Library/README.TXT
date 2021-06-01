PROJECT TITLE: TMA03 Q3
PURPOSE OF PROJECT: Beer Library
VERSION or DATE: Main 09/04/21
AUTHORS: Sacha Ponniah
--------------------------------------------------------------------
Test code:
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
