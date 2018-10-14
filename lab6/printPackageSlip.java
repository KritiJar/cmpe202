import java.util.*;
public class printPackageSlip implements PrintBill
{
    ArrayList<String> topBun=new ArrayList<>();
    ArrayList<String> bottomBun=new ArrayList<>();
    ArrayList<String> meat=new ArrayList<>();
    public void printdesc(Burger burger,Fries fries)
  {
      System.out.println("Package Slip");
      System.out.println(burger.getQuantity()+" "+burger.getBurger());
      for(int i=0;i<burger.getToppings().length;i++)
      {
             
                      if(burger.getToppings()[i].charAt(0)=='-' )
                      {
                          meat.add(burger.getToppings()[i]);
                      }
                      else if(burger.getToppings()[i].charAt(0)=='{' )
                          {
                              bottomBun.add(burger.getToppings()[i]);
                            }
                            else
                            {
                                topBun.add(burger.getToppings()[i]);
                            }
                            
      }
                        
       for (int i=0; i<topBun.size(); i++) 
            System.out.println(topBun.get(i)+" "); 
      
       for (int i=0; i<meat.size(); i++) 
            System.out.println(meat.get(i)+" "); 

                   for (int i=0; i<bottomBun.size(); i++) 
            System.out.println(bottomBun.get(i)+" "); 

       
      System.out.println(fries.getQuantity()+" "+fries.getFries());
    }
    
}
