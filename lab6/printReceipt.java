    
/**
 * Write a description of class printReceipt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class printReceipt implements PrintBill
{
  public void printdesc(Burger burger,Fries fries)
  {
      System.out.println("Receipt");
      System.out.println(burger.getQuantity()+" "+burger.getBurger()+" "+burger.getPrice());
      for(int i=0;i<burger.getToppings().length;i++)
      {
          
      System.out.println(burger.getToppings()[i]);
      }
      System.out.println(fries.getQuantity()+" "+fries.getFries()+" "+fries.getPrice());
      
  }
}
