<h1>Beer Library ReadMe</h1> 
<h3>PURPOSE OF PROJECT:</h3> 

<h5>
  This was my solution to a University Assignment question (from 1st Hons year of BSc Computing & IT).</br></br>
  
  The purpose of this project was to model a scenario of our choice with a small application that makes use of a map and provides the user with the ability to     store, manipulate and extract data. We were encouraged to express ourselves and to choose an area that interested us, but we had to keep within the specification given below.

  It was up to us what scenario we invented, the type of map we chose (sorted or unsorted), and the types of the map keys and values, as long as the       following conditions were met:

  -  The keys had to be of type String or Integer.
  - The value types had to be either a List or a Set from the Collections Framework. The values could not be references to individual objects.

  My solution is decribed in the below table:

  | General scenario | A ‘beer library’ to allow a specialist off-licence to keep a record of the beers they stock using an unsorted map, where each key                        of the map is a String, representing the name of a brewery, and the values are sets of strings, where each String in this Set                            represents a beer produced by that brewery. |
  |:--------------------------- | :------------------------------------|
  | Type of key (String or integer) |	String |
  | Type of value (must be from Collections framework) |	Set of Strings |
  | Type of map (sorted or unsorted) |	unsorted |
  </h5>

<h4> The following test code can be used to test the application. Descriptions of methods are included as comments accompanying the code: </h4>

Create new BeerLibrary and assign it to bl1:
  
```java
BeerLibrary bl1 = new BeerLibrary();
```


Populate bl1 with test brewery data:

```java
bl1.populateBreweries();
```

Print all breweries and beers stocked for each:

```java
bl1.printMap();
```

Print list of beers stocked for a named brewery (brewery is in bl1):

```java
bl1.printMapValue("Tempest");
```
Attempt to print list of beers stocked for a named brewery (brewery is not in bl1):

```java
bl1.printMapValue("Carlsberg");//brewery is not in beerLibrary
```

Create new brewery and add three beers to it:

```java
Set<String> dryGateBeers = new HashSet<>();
dryGateBeers.add("Gladeye");
dryGateBeers.add("DiscoForkliftTruck");
dryGateBeers.add("Orinoco");
```

Add the above Brewery to bl1 and check it has been added:

```java
bl1.addMapEntry("Drygate", dryGateBeers);
bl1.prntMap();
```

Attempt to delete a brewery from bl1 (brewery is in bl1) and check it has been deleted:

```java
bl1.deleteEntry("Tempest");
bl1.printMap();
```

Attempt to delete a brewery from bl1 (brewery is not in bl1) and check it has been deleted:

```java
bl1.deleteEntry("Carlsberg");//brewery is not in beerLibrary
bl1.printMap();
```

Attempt to add a beer to an existing brewery (using test breweries data) and confirm beer has been added:

```java
bl1.populateBreweries();//to re-populate library
bl1.addToValueAtKey("Tempest", "Elemental");
bl1.printMapValue("Tempest");
```

Attempt to remove a beer from an existing brewery (using test breweries data) and confirm beer has been removed:

```java
bl1.deleteFromValueAtKey("Tempest", "Mexicake");
bl1.printMapValue("Tempest");
```
