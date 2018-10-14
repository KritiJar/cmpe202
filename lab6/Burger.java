public class Burger
{
    String burger;
    float price;
    String toppings[];
    int quantity;
    void setBurger(String burger)
    {
        this.burger=burger;
    }
    void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    void setPrice(float price)
    {
        this.price=price;
    }
    void setToppings(String toppings[])
    {
        this.toppings=toppings;
    }
    String getBurger()
    {
        return burger;
    }
    int getQuantity()
    {
        return quantity;
    }
    float getPrice()
    {
        return price;
    }
    String[] getToppings()
    {
        return toppings;
    }

    
    
    
}
