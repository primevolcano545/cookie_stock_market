import java.util.Scanner;
import java.util.Random;

public class something {
    public static void help()  {
        System.out.println("Commands");
    }



    public static void stock(snickerdoodles snickerdoodles_object, int snickerdoodles_price_int)  {
        snickerdoodles_object = snickerdoodles_object.set_price(snickerdoodles_object.price + snickerdoodles_price_int);
        System.out.println("SnickerDoodle stock price" + snickerdoodles_object.price);
    }
    


    public static void main(String[] args)  {
        boolean game_active = true;
        int cookies = 0;
        
        int depression = 0;
        boolean depressed = false;
        snickerdoodles snickerdoodles_object = new snickerdoodles(5,10);
        //snickerdoodles_object.set_price(5);
        //System.out.println(snickerdoodles_object.price);


        //for (int i=0; i<cookie_types.length; i++)    {
        //    cookies = cookies + cookie_types[i];
        //}

        while (game_active == true)  {
            Random snickerdoodle_price = new Random();

            Scanner playerinput = new Scanner(System.in);  // Create a Scanner object
            String PInput = playerinput.nextLine();  // Read user input
            

            if (PInput == "help")   {
                help();
            }   else if (PInput == "help")  {
                int snickerdoodles_price_int = snickerdoodle_price.nextInt(10);
                stock(snickerdoodles_object,snickerdoodles_price_int);
            }   else    {
                System.out.println("Invalid command, use help to know valid commands");
            }
            
        }
    }
    
}