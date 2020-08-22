import java.util.*;
public class Conversion
{
    private final double F_RATIO = 9.0/5;
    private final double K_RATIO = 8.0/5;
    Scanner in = new Scanner(System.in);
    
    public Conversion()
    {
        menu();
    }
    public double toFahrenheit(double celsius)
    {
        double fahrenheit = F_RATIO * celsius + 32;
        return fahrenheit;
    }
    public double toKilometres(double miles)
    {
        double km = K_RATIO * miles;
        return km;
    }
    private void menu()
    {
        char action = readChoice();
        while (action != 'X') //&& action != 'x' not ||
        {
            if (action == 'F')
            {
                //Scanner in = new Scanner(System.in);
                System.out.println("Insert celcius to convert to F");
                double celcius = in.nextDouble();
                double fahAnswer = toFahrenheit(celcius);
                System.out.println(celcius + " to F is " + fahAnswer);
            }
            else if (action == 'K')
            {
                //Scanner in = new Scanner(System.in);
                System.out.println("Insert miles to convert to kilos");
                double miles = in.nextDouble();
                double kiloAnswer = toKilometres(miles);
                System.out.println(miles + " to kilo is " + kiloAnswer);
            }
            else if (action == 'M')
            {
                mileConversion();
            }
            else if (action =='A')
            {
                averageTemp();
            }
            else if(action == '?')
            {
                help();
            }
            action = readChoice();
        }
    }
    private void help()
    {
        System.out.println("Enter F (Fahrenheit), K (Kilometres), M (Miles), A(Average temperature)  or X (finish) ");
    }
    private char readChoice()
    {
        System.out.println("Please enter your choice (F, K, M, A, X, ?) : ");
        return in.next().toUpperCase().charAt(0);
        //toUpperCase() is method in String class
    }
    private void mileConversion()
    {
        System.out.println("Enter the highest mile value");
        double highMile = in.nextDouble();
        System.out.println("Enter the lowest mile value");
        double lowMile = in.nextDouble();
        
        double i = lowMile;
        
        while (i <= highMile)
        {
            double iKilo = toKilometres(i);
            System.out.println(i+ " miles is equal to " + iKilo + "km");
            i++;
        }
        
    }
    private void averageTemp()
    {
        int i = 0;
        double total = 0;
        do
        {
            System.out.println("Insert a temperature in celsius");
            double temp = in.nextDouble();
            total = total + temp;
            i++;
        }
        while(i<6);
        double aveTotal = total/i;
        System.out.println("The average in Fahrenheit is " + toFahrenheit(aveTotal));
    }
}