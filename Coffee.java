import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;//necessary for writing in file
import java.io.FileNotFoundException;
/**
 * Class Coffee sets up an order for a beverage coffee, having multiple options
 * such as the size, type of coffee, and temperature.
 *
 * @author (Raphael Juco)
 * @version (6/5/18)
 */
public class Coffee
{
    private String Coffee = "";
    private Scanner keyboard = new Scanner(System.in);
    private boolean infiniteLoop = true;//constant
    /**
     * This method calls all the method to make the coffee in order.
     */
    public void makeCoffee(){
        size();
        temp();
        type();
    }

    /**
     * Precondition : instance variable Coffee has already been filled out.
     * Postcondition: writes the contents of Coffee into file record.txt.
     */
    public void recordOrder(){
        PrintWriter output = null;
        try{
            output = 
            new PrintWriter(new FileOutputStream("record.txt", true));
        }
        catch(Exception e){//throws exception
            System.out.println("File not found");
            System.exit(0);
        }
        output.println(Coffee);//prints in file contents of Coffee
        output.close();//closes file
    }

    /**
     * Precondition: When called Coffee should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Coffee as a String
     */
    public void type(){
        while(infiniteLoop){
            System.out.println("What type of Coffee do you want?");
            System.out.println("Press 1 - expresso");
            System.out.println("Press 2 - latte");
            System.out.println("Press 3 - cappuccino");
            System.out.println("Press 4 - mocha");
            int x = keyboard.nextInt();
            /*
             * saves user choice to instant variable Coffee
             * and continues to ask if choice is invalid
             */
            if(x == 1){
                expresso();
                Coffee = Coffee + "expresso.";
                break;
            }
            else if(x == 2){
                latte();
                Coffee = Coffee + "latte.";
                break;
            }
            else if(x == 3){
                cappuccino();
                Coffee = Coffee + "cappuccino.";
                break;
            }
            else if(x == 4){
                mocha();
                Coffee = Coffee + "mocha.";
                break;
            }
            System.out.println("Please enter valid response");
        }
    }

    /**
     * Precondition: When called Coffee should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Coffee as a String
     */
    public void expresso(){
        while(infiniteLoop){
            System.out.println("Short or Long");
            System.out.println("Press 1 - short");
            System.out.println("Press 2 - long");
            int x = keyboard.nextInt();
            if(x == 1){
                Coffee = Coffee + "short, ";
                break;
            }
            else if(x == 2){
                Coffee = Coffee + "long, ";
                break;
            }
            System.out.println("Please enter valid response");
        }
    }

    /**
     * Precondition: When called Coffee should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Coffee as a String
     */
    public void latte(){
        while(infiniteLoop){
            System.out.println("How many shots of expresso would you like?");
            int x = keyboard.nextInt();
            if(x >= 0 && x <= 10){
                if(x == 0){
                    Coffee = Coffee + "with no shot of expresso, ";
                    break;
                }
                else{
                    Coffee = Coffee + x + " shots of expresso, ";
                    break;
                }
            }
            System.out.println("Please enter realistic amount");
        }
        while(infiniteLoop){
            System.out.println("Foam or no foam");
            System.out.println("Press 1 - foam");
            System.out.println("Press 2 - no foam");
            int y = keyboard.nextInt();
            if(y == 1){
                Coffee = Coffee + "with foam, ";
                break;
            }
            else if(y == 2){
                Coffee = Coffee + "with no foam, ";
                break;
            }
            System.out.println("Please enter valid response");
        }
    }

    /**
     * Precondition: When called Coffee should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Coffee as a String
     */
    public void cappuccino(){
        while(infiniteLoop){
            System.out.println("Hot milk or no milk");
            System.out.println("Press 1 - hot milk");
            System.out.println("Press 2 - no milk");
            int x = keyboard.nextInt();
            if(x == 1){
                Coffee = Coffee + "hot milk, ";
                break;
            }
            else if(x == 2){
                Coffee = Coffee + "no milk, ";
                break;
            }
            System.out.println("Please enter valid response");
        }
        while(infiniteLoop){
            System.out.println("Foam or no foam");
            System.out.println("Press 1 - foam");
            System.out.println("Press 2 - no foam");
            int y = keyboard.nextInt();
            if(y == 1){
                Coffee = Coffee + "with foam, ";
                break;
            }
            else if(y == 2){
                Coffee = Coffee + "no foam, ";
                break;
            }
            System.out.println("Please enter valid response");
        }
    }

    /**
     * Precondition: When called Coffee should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Coffee as a String
     */
    public void mocha(){
        while(infiniteLoop){
            System.out.println("White or dark chocolate");
            System.out.println("Press 1 - white chocolate");
            System.out.println("Press 2 - dark chocolate");
            int y = keyboard.nextInt();
            if(y == 1){
                Coffee = Coffee + "white chocolate, ";
                break;
            }
            else if(y == 2){
                Coffee = Coffee + "dark chocolate, ";
                break;
            }
            System.out.println("Please enter valid response");
        }
        while(infiniteLoop){
            System.out.println("Hot milk or no milk");
            System.out.println("Press 1 - hot milk");
            System.out.println("Press 2 - no milk");
            int x = keyboard.nextInt();
            if(x == 1){
                Coffee = Coffee + "with hot milk, ";
                break;
            }
            else if(x == 2){
                Coffee = Coffee + "no milk, ";
                break;
            }
            System.out.println("Please enter valid response");
        }
    }

    /**
     * Precondition: When called Coffee should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Coffee as a String
     */
    public void size(){
        while(infiniteLoop){
            System.out.println("Please choose a size: ");
            System.out.println("Press 1 - short");
            System.out.println("Press 2 - tall");
            System.out.println("Press 3 - grande");
            System.out.println("Press 4 - venti");
            int size = keyboard.nextInt();
            if(size == 1){
                Coffee = Coffee + "A short, ";
                break;
            }
            else if(size == 2){
                Coffee = Coffee + "A tall, ";
                break;
            }
            else if(size == 3){
                Coffee = Coffee + "A grande, ";
                break;
            }
            else if(size == 4){
                Coffee = Coffee + "A venti, ";
                break;
            }
            System.out.println("Please enter valid response");
        }
    }

    /**
     * Precondition: When called Coffee should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Coffee as a String
     */
    public void temp(){
        while(infiniteLoop){
            System.out.println("Choose the temperature of beverage");
            System.out.println("Press 1 - Extra cold (iced)");
            System.out.println("Press 2 - Cool");
            System.out.println("Press 3 - Hot");
            System.out.println("Press 4 - Extra Hot");
            int x = keyboard.nextInt();
            if(x == 1){
                Coffee = Coffee + "extra cold (iced), ";
                break;
            }
            else if(x == 2){
                Coffee = Coffee + "cool, ";
                break;
            }
            else if(x == 3){
                Coffee = Coffee + "hot, ";
                break;
            }
            else if(x == 4){
                Coffee = Coffee + "extra hot, ";
                break;
            }
            System.out.println("Please choose a proper answer");
        }
    }

    /**
     * Preconditions: String Coffee is empty for this is the first statement
     * Postconditions: String Coffee contains what the user has input
     */
    public void timeSet(){
        System.out.println("Please enter the time with (AM/PM): ");
        String time = keyboard.nextLine();
        Coffee = "Drink is set to be made at " + time + ". ";
    }

    /**
     * Precondition: String Tea has already been filled from other methods
     * Postcondition: Returns Tea in order form
     */
    public String toString(){
        return this.Coffee;
    }
}
