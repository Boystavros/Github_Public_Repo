import java.util.*;
/**
 * TMA03 Question 3.
 * A beer library to record the beers stocked from several breweries.
 * 
 * @author Sacha Ponniah
 * @version 13 April 2021
 */
public class BeerLibrary
{
   private Map<String, Set<String>> breweries;

   /**
    * Constructor for objects of class BeerLibrary
    */
   public BeerLibrary()
   {
      super();
      this.breweries = new HashMap<>();
   }

   /**
    * Populates the receiver's breweries map with 
    * test data, with brewery names as keys and 
    * sets of beer names as values.
    */
   public void populateBreweries()
   {
      String brewery1 = "BrewDog";
      Set<String> beers1 = new HashSet<>();
      beers1.add("PunkIPA");
      beers1.add("ElvisJuice");
      beers1.add("NannyState");
      String brewery2 = "Tempest";
      Set<String> beers2 = new HashSet<>();
      beers2.add("BraveNewWorld");
      beers2.add("SpectralHaze");
      beers2.add("Mexicake");
      this.breweries.put(brewery1, beers1);
      this.breweries.put(brewery2, beers2);
   }
   
   /**
    * Prints out the name of each brewery recorded in receiver's 
    * breweries map, along with the set of stocked beers
    * produced by each brewery.
    */
   public void printMap()
   {
      for(String eachBrewery : this.breweries.keySet())
      {
         this.printMapValue(eachBrewery);
      }
   }
   
   /**
    * If aBrewery is in receiver's breweries map, 
    * prints the brewery name followed by the set containing 
    * stocked beers produced by it. Otherwise, prints unsuccessful 
    * message.
    * @param aBrewery a single String, 
    * representing the name of a brewery.
    */
   public void printMapValue(String aBrewery)
   {
      if (this.breweries.containsKey(aBrewery))
      {
         System.out.println("The " + aBrewery
                            + " beers that we stock are "
                            + this.breweries.get(aBrewery)
                            + ".");
      }
      else
      {
         System.out.println("There are no beers recorded in this"
                            + " beer library that are produced by "
                            + aBrewery);
      }
   }
   
   /**
    * Adds a brewery and the set of beers produced by it to receiver's
    * breweries map. If the brewery is already present in receiver's 
    * breweries map, the existing set of beers is overwritten.
    * @param aBrewery a single String, representing the name of a brewery.
    * @param aBeerSet a Set of Strings, representing beers produced by that 
    * brewery.
    */
   public void addMapEntry(String aBrewery, Set<String> aBeerSet)
   {
      this.breweries.put(aBrewery, aBeerSet);
   }
   
   /**
    * If the brewery passed is in the receiver's breweries map, removes it 
    * and the set of beers it produces from the breweries map and returns 
    * true. Otherwise, returns false.
    * @param aBrewery a single String, representing the name of a brewery.
    */
   public boolean deleteEntry(String aBrewery)
   {
      return this.breweries.remove(aBrewery) != null;
   }
      
   /**
    * Adds the beer name passed to the set of beers produced by the brewery
    * whose name was passed.
    * @param aBrewery a single String, representing the name of a brewery in 
    * receiver's breweries map.
    * @param aBeer a single String, representing the name of a beer produced
    * by aBrewery.
    */
   public void addToValueAtKey(String aBrewery, String aBeer)
   {
      (this.breweries.get(aBrewery)).add(aBeer);
   }
   
   /**
    * Removes the beer with the name passed from the set of beers produced
    * by the brewery whose name was passed.
    * @param aBrewery a single String, representing the name of a brewery in 
    * receiver's breweries map.
    * @param aBeer a single String, representing the name of a beer in the
    * set of beers produced by aBrewery.
    */
   public void deleteFromValueAtKey(String aBrewery, String aBeer)
   {
      (this.breweries.get(aBrewery)).remove(aBeer);
   }

}
