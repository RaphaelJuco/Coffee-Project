import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.PrintWriter;//necessary for writing in file
import java.io.FileNotFoundException;
/**
 * Class Tea sets up an order for a beverage tea, having multiple options
 * such as the size, type of tea, temperature, and any additives.
 *
 * @author (Raphael Juco)
 * @version (6/5/2018)
 */
public class Tea
{
    private String Tea = "";
    private Scanner keyboard = new Scanner(System.in);
    boolean infiniteLoop = true;//constant
    /**
     * Precondition : instance variable Tea has already been filled out.
     * Postcondition: writes the contents of Tea into file record.txt.
     */
    public void recordOrder(){      
        PrintWriter output = null;
        try{
            output = 
            new PrintWriter(new FileOutputStream("record.txt", true));
        }
        catch(Exception e){
            System.out.println("File not found");
            System.exit(0);
        }
        output.println(Tea);//writes into the file contents of String Tea
        output.close();//closes file
    }

    /**
     * This method calls all the method to make the tea in order.
     */
    public void makeTea(){
        size();
        temp();
        type();
        additives();
    }

    /**
     * Precondition: When called Tea should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Tea as a String
     */
    public void size(){
        while(infiniteLoop){
            System.out.println("Please choose a size: ");
            System.out.println("Press 1 - small");
            System.out.println("Press 2 - medium");
            System.out.println("Press 3 - large");
            int size = keyboard.nextInt();
            /*
             * saves user choice to instant variable Tea
             * and continues to ask if choice is invalid
             */
            if(size == 1){
                Tea = Tea + "A small, ";
                break;
            }
            else if(size == 2){
                Tea = Tea + "A medium, ";
                break;
            }
            else if(size == 3){
                Tea = Tea + "A large, ";
                break;
            }
        }
    }

    /**
     * Precondition: When called Tea should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Tea as a String
     */
    public void type(){
        while(infiniteLoop){
            System.out.println("What type of Tea do you want?");
            System.out.println("Press 1 - green");
            System.out.println("Press 2 - black");
            System.out.println("Press 3 - herbal");
            System.out.println("Press 4 - white");
            int x = keyboard.nextInt();
            if(x == 1){
                Tea = Tea + "green tea, ";
                break;
            }
            else if(x == 2){
                Tea = Tea + "black tea, ";
                break;
            }
            else if(x == 3){
                Tea = Tea + "herbal tea, ";
                break;
            }
            else if(x == 4){
                Tea = Tea + "white tea, ";
                break;
            }
            System.out.println("Please enter valid response");
        }

    }

    /**
     * Precondition: When called Tea should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Tea as a String
     */
    public void additives(){
        String tempVar = "";
        outerloop://reference to outerloop for breaking
        while(infiniteLoop){
            while(infiniteLoop){
                System.out.println("What would you like on your tea?");
                System.out.println("Press 1 - lemon");
                System.out.println("Press 2 - honey");
                System.out.println("Press 3 - half and half");
                System.out.println("Press 4 - sugar");
                System.out.println("Press 5 - no additives");
                int x = keyboard.nextInt();
                if(x == 1){
                    tempVar = tempVar + "with lemon, ";
                    break;
                }
                else if(x == 2){
                    tempVar = tempVar + "with honey, ";
                    break;
                }
                else if(x == 3){
                    tempVar = tempVar + "with half and half, ";
                    break;
                }
                else if(x == 4){
                    tempVar = tempVar + "with sugar, ";
                    break;
                }
                else if(x == 5){
                    Tea = Tea + "with no additives, ";
                    break outerloop;
                }
                System.out.println("Please choose a proper response");
            }
            System.out.println("Is that all? (y or n)");
            char yesOrNo = keyboard.next().charAt(0);
            if(yesOrNo == 'y'){
                Tea = Tea + tempVar;
                break;
            } 
        }
    }

    /**
     * Precondition: When called Tea should be initialized as instance variable.
     * Postcondition: The chosen option by the user is saved in Tea as a String
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
                Tea = Tea + "extra cold (iced), ";
                break;
            }
            else if(x == 2){
                Tea = Tea + "cool, ";
                break;
            }
            else if(x == 3){
                Tea = Tea + "hot, ";
                break;
            }
            else if(x == 4){
                Tea = Tea + "extra hot, ";
                break;
            }
            System.out.println("Please choose a proper answer");
        }
    }

    /**
     * Preconditions: String Tea is empty for this is the first statement
     * Postconditions: String Tea contains what the user has input
     */
    public void timeSet(){
        System.out.println("Please enter the time with (AM/PM): ");
        String time = keyboard.nextLine();
        Tea = "Drink is set to be made at " + time + ". ";
    }

    /**
     * Precondition: String Tea has already been filled from other methods
     * Postcondition: Returns Tea in order form
     */
    public String toString(){
        return this.Tea;
    }
}
