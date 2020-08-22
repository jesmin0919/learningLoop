import java.util.*;
public class Test
{
    public Test()
    {

    }

    public void basicWhile()
    {
        int counter = 0;
        while (counter < 10)
        {
            System.out.println("Counter is " + counter);
            counter++; // counter can change anytime in the body
        }

    }

    void addCounter()
    {
        int total = 0;
        for(int k = 10; k<15; k++)
        {
            total = total + k;
        }
        System.out.println("Total = " + total);
    }

    public void addK()//exD, same function as addCounter
    {
        int k = 10;
        int total = 0;
        while (k < 15)
        {
            total = total + k;
            k++;
        }
        System.out.println(total);
    }

    public void charInput()
    {
        Scanner in = new Scanner(System.in);
        
        int total = 0;
        char letter;
        do
        {
            System.out.println("Enter number to add");
            int num = in.nextInt();
            total = total + num;
            System.out.println("Total = " + total);
            System.out.println("Do you wish to continue? (y/n)");
            letter = in.next().charAt(0); //yes
            
        }
        while (letter == 'y' || letter == 'Y');
    }

    public void basicNestedFor()
    {
        for(int i=0; i<10; i++)
        {
            for(int j = 0; j<10; j++)
            {
                System.out.println("i = "+i + "j = "+j);
            }
            System.out.println("line "+ i);
        }
    }

    public void multTable5()
    {
        for(int i = 1; i<6; i++)
        {
            for(int j = 1; j <6; j++)
            {
                System.out.print(i*j + " ");
            }
            System.out.println("\n");
        }
    }

    public void shape()
    {
        String result = "";
        for(int row = 0; row <5; row++)
        {
            for(int col = 0; col <10; col++)
            {
                result = result + "*";
            }
            result = result + "\n";
        }
        System.out.println(result);
    }

    public void shapeWhile()
    {
        int row = 0;
        String result = "";
        while(row<5)
        {
            int col = 0;
            while( col < 10)
            {
                
                result = result + "*";
                col++;
            }
            result = result +"\n";
            row++;
        }
        System.out.println(result);
    }
}