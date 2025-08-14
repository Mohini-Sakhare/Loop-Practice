//print reverse number

public class whileloop5
{
    public static void main(String args[])
    {
        int n=10899;
         int rev=0;
        while(n>0)
        {
            int lastdigit=n%10;

            //System.out.print(lastdigit+ " ");
            rev=(rev*10) + lastdigit;
            n=n/10;
        }
        System.out.println(rev);
    }
    
}
