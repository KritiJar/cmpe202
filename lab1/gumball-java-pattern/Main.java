
public class Main {

    public static void main(String[] args) {
        OneQuarterMachine gumballMachine1 = new OneQuarterMachine(5);
        TwoQuarterMachine gumballMachine2=new TwoQuarterMachine(5);
        AllCoinMachine gumballMachine3=new AllCoinMachine(5);

        System.out.println(gumballMachine1);
        gumballMachine1.insertCoin(10);
        gumballMachine1.insertCoin(25);
        gumballMachine1.turnCrank();
        
    	System.out.println(gumballMachine2);

        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();
        gumballMachine2.insertCoin(25);
        gumballMachine2.turnCrank();


        
      	System.out.println(gumballMachine3);
        
        gumballMachine3.insertCoin(25);
        gumballMachine3.turnCrank();
        gumballMachine3.insertCoin(10);
        gumballMachine3.turnCrank();
        
        gumballMachine3.insertCoin(10);
        gumballMachine3.turnCrank();
        gumballMachine3.turnCrank();
        
        gumballMachine3.insertCoin(5);
        gumballMachine3.turnCrank();
    }
}
