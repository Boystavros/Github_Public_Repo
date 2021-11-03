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
