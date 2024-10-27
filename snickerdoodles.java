public class snickerdoodles extends cookies    {
    static int hunger;
    static int price;

     snickerdoodles(int hunger,int price)    {
        this.hunger = hunger;
        this.price = price;
    }

    public static void set_hunger(int new_hunger)  {
        hunger = new_hunger;
    }

    public static void set_price(int new_price)  {
        price = new_price;
    }
}