import java.util.*;

/**
 * The class Builder is used to hold data about the builder's 
 * on site  contractors, and their contact details and trade. 
 * 
 * @Sacha Ponniah 
 * @v1 05 April 2021  
 */
 public class Builder
 {
   private Map<String, Contractor> contractors; 
       
   /**
     * Constructor for objects of class Builder
     */
   public Builder()
   {
      super();
      contractors = new HashMap<>();
   }
   
   /**
    * Creates a constructor object, initialises it with the name,
    * address and trade arguments provided and adds it to the 
    * receiver's constructors variable, referenced by the 
    * vehicle registration argument provided. 
    */
   public void addContractor(String aReg, 
                             String aName, 
                             String anAddress,
                             String aTrade)
   {
      Contractor newContractor = new Contractor(aName, 
                                                anAddress, 
                                                aTrade);
      
      this.contractors.put(aReg, newContractor);
   }
   
   /**
    * Prints a String representation of each Contractor in receiver's 
    * contractors collection, one per line.
    */
   public void printContractors()
   {
      for(String eachReg : this.contractors.keySet())
      {
         Contractor contractor = this.contractors.get(eachReg);
         System.out.println(contractor.toString());
      }
   }
}
