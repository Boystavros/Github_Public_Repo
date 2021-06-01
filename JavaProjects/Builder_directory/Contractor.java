/**
 * The class Contractor represents building contractors - with name, 
 * address and trade of the contractor.
 * 
 * @author M250 module team
 * @version v1.0
 */
public class Contractor
{
   private String name;
   private String address;
   private String trade;

   /**
    * Constructor for objects of class Contractor
    */
   public Contractor(String aName, String anAddress, String aTrade)
   {
      this.name = aName;
      this.address = anAddress;
      this.trade = aTrade;
   }
   
   /**
   * returns the name of the contractor
   */
   public String getName()
   {
      return this.name;
   }
  
   /**
   * returns the address of the contractor
   */
   public String getAddress()
   {
      return this.address;
   }
  
   /**
   * returns the trade of the contractor
   */
   public String getTrade()
   {
      return this.trade;
   }
   
   /**
   * returns a string representation of the contractor
   */
   public String toString()
   {
      return (this.getName() + ", " 
	          + this.getAddress() 
			  + ", trade: " + this.getTrade());
   }
}

