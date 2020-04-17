import java.util.Scanner;//for reading user input
/**
 * The driver prompts the user what he wants to do. To make, set or order 
 * a drink. The driver also creates the object of class Tea and Coffee and 
 * calls its methods to construct the drink.
 *
 * @author (Raphael Juco)
 * @version (6/5/18)
 */
public class DrinkMaker
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        boolean infiniteLoop = true;//constant
        while(infiniteLoop){
            System.out.println("Hello choose an option");
            System.out.println("Press 1 - Make a drink");
            System.out.println("Press 2 - Set up time to make a drink");
            System.out.println("Press 3 - Order a drink from coffee shop");
            int choice = keyboard.nextInt();
            choices(choice);
        }
    }

    /**
     * Preconditions: No object of coffee or tea has been made
     * Postconditions: Creates chosen drink of user and prints 
     * it to the screen
     */
    public static void choices(int choice){
        Scanner keyboard = new Scanner(System.in);
        Tea tea = new Tea();//creates new object Tea
        Coffee coffee = new Coffee();//creates new object Coffee
        boolean infiniteLoop = true;//constant
        /*
         * depending on users choice from main, each branch has its 
         * own direction
         */
        if(choice == 1){
            System.out.println("Make a drink");
            /*
             * the loop continues to ask the user to enter 
             * a valid response
             */
            while(infiniteLoop){
                System.out.println("Choose a type of drink: ");
                System.out.println("Press 1 - Coffee");
                System.out.println("Press 2 - Tea");
                int y = keyboard.nextInt();
                /*
                 * The user chooses a type of beverage then 
                 * the the methods of each class is called 
                 */
                if(y == 1){
                    coffee.makeCoffee();
                    System.out.print(coffee);
                    System.out.println(" Coming right up.");
                    coffee.recordOrder();
                    break;
                }
                else if(y == 2){
                    tea.makeTea();
                    System.out.print(tea);
                    System.out.println(" Coming right up.");
                    tea.recordOrder();
                    break;
                }
                else{
                    System.out.println("You only have coffee or tea");
                }
            }
            System.out.println("Thanks for using iCoffee");
            System.exit(0);//exits the program
        }
        else if(choice == 2){
            System.out.println("Set up time to make a drink");
            while(infiniteLoop){
                System.out.println("Choose a type of drink: ");
                System.out.println("Press 1 - Coffee");
                System.out.println("Press 2 - Tea");
                int y = keyboard.nextInt();
                if(y == 1){
                    coffee.timeSet();
                    coffee.makeCoffee();
                    System.out.println(coffee);
                    coffee.recordOrder();
                    break;
                }
                else if(y == 2){
                    tea.timeSet();
                    tea.makeTea();
                    System.out.println(tea);
                    tea.recordOrder();
                    break;
                }
                else{
                    System.out.println("You only have coffee or tea");
                }
            }
            System.out.println("Thanks for using iCoffee");
            System.exit(0);
        }
        else if(choice == 3){
            System.out.println("Order drink from coffee shop");
            while(infiniteLoop){
                System.out.println("Choose a type of drink: ");
                System.out.println("Press 1 - Coffee");
                System.out.println("Press 2 - Tea");
                int y = keyboard.nextInt();
                if(y == 1){
                    System.out.println("What time would you like to pick it up?");
                    coffee.timeSet();
                    coffee.makeCoffee();
                    System.out.println(coffee);
                    System.out.println("Please pick up drink at designated time.");
                    coffee.recordOrder();
                    break;
                }
                else if(y == 2){
                    System.out.println("What time would you like to pick it up?");
                    tea.timeSet();
                    tea.makeTea();
                    System.out.println(tea);
                    System.out.println("Please pick up drink at designated time.");
                    tea.recordOrder();
                    break;
                }
                else{
                    System.out.println("You only have coffee or tea");
                }
            }
            System.out.println("Thanks for using iCoffee");
            System.exit(0);
        }
        else{
            System.out.println("Enter a valid option");
        }
    }
}