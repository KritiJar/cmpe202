public class Test
{
    public static void main(String args[])
    {
            String topping[]={"{{{{BACON}}}}","LETTUCE","TOMATO","->|G ONION","->|JALA GRILLED"};
            Burger burger=new Burger();
            burger.setBurger("LBB");
            burger.setPrice(5.59f);
            burger.setToppings(topping);
            burger.setQuantity(1);
            Fries fries=new Fries();
            fries.setFries("LTL CAJ");
            fries.setQuantity(1);
            fries.setPrice(2.79f    );

            
            
            PrintBill packageslip=new printPackageSlip();
            PrintBill receipt=new printReceipt();
            packageslip.printdesc(burger,fries);
            receipt.printdesc(burger,fries);
            
            
        
        
        
    }
}
