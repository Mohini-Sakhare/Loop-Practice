//print sum of 1 to n numbers
import java.util.*;

public class whileloop4 
{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number=");

        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n)
        {
            sum+=i;
            i++;
        }
        System.out.println("sum=" +sum);
    }
    
}
