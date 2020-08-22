import java.util.*;
public class Menu
{
    Scanner in = new Scanner(System.in);
    public Menu()
    {
        menu();
    }
    private void menu()
    {
        char action = readChoice();
        while (action != 'X') //&& action != 'x' not ||
        {
            if (action == 'H' || action == 'h')
            {
                hello();
            }
            else if (action == 'G')
            {
                gDay();
            }
            else if(action == '?')
            {
                help();
            }
            action = readChoice();
        }
    }
    private char readChoice()
    {
        System.out.println("Please enter your choice (H, G, X, ?) : ");
        return in.next().toUpperCase().charAt(0);
        //toUpperCase() is method in String class
    }
    private void hello()
    {
        System.out.println("Hello");
    }
    private void gDay()
    {
        System.out.println("G'Day Mate");
    }
    private void help()
    {
        System.out.println("Enter H (Hello), G (G'Day) or X (Exit) ");
    }
}