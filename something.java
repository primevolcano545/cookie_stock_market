public class something {
    public static void help()  {
        System.out.println("Help menu?");
    }
    
    public static void main(String[] args)  {
        
        snickerdoodles snickerdoodles_object = new snickerdoodles(5,10);
        snickerdoodles_object.set_price(5);
        System.out.println(snickerdoodles_object.price);

        

        int cookies = 0;
        int[] cookie_types = {1,2,3,4,5};
        
        boolean depressed = false;
        
        for (int i=0; i<cookie_types.length; i++)    {
            cookies = cookies + cookie_types[i];
        }


        String cookies_text = "You Have " + cookies + " cookies";
        System.out.println(cookies_text);
        if (cookies == 0 && depressed == true)   {
            System.out.println("You are depressed and have 0 cookies");
        }   else if (cookies > 0 && depressed == true)  {
            System.out.println("You have " + cookies + " and are depressed");
        }   else  {
            System.out.println("You have " + cookies + " and are happy");
        }

        help();

    }
    
}