package runescape.grand.exchange.wu;

import java.util.Scanner;

/**
 * The ProfitCalculator calculates the rate of profit, the amount of Runescape gold points (GPs) per hour
 */
public class ProfitCalculator
{
    /**
     * The ProfitCalculator constructor
     */
    public ProfitCalculator()
    {
        askForSkill();
    }

    private void askForSkill()
    {
        Scanner scanner;
        String  option;

        scanner = new Scanner(System.in);

        System.out.println("Enter your preferred skill:\n1. Crafting\n2. Mining\n3. Fishing\n4. Flipping");
        option = scanner.next();

        switch(option)
        {
            case "1":
                provideCraftingDetails();
                break;
            case "2":
                provideMiningDetails();
                break;
            case "3":
                provideFishingDetails();
                break;
            default:
                provideFlippingDetails();
        }
    }

    private void provideFlippingDetails()
    {
    }

    private void provideFishingDetails()
    {
    }

    private void provideMiningDetails()
    {
    }

    private void provideCraftingDetails()
    {
    }

    /**
     * The entry point of the program
     * @param args is the command land arguements (unused)
     */
    public static void main(final String[] args)
    {
        ProfitCalculator obj;
        obj = new ProfitCalculator();
    }

}
