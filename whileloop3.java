// print 1 to n number using while loop by user range

import java.util.*;

public class whileloop3
{
    public static void main(String args[])
    {
        @SuppressWarnings({ "resource" })
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the range:");
        int range=sc.nextInt();
        
        int counter=1;
        
        while(counter <= range)
        {
          
            System.out.print(counter+ " ");
            counter++;
        }
        System.out.println();
    }
}