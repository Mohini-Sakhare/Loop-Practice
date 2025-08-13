//display numbers except number in a condition

public class continuekey
{
   public static void main(String args[])
   {
     for(int i=1; i<=5; i++)
     {
        if(i==3)
        {
            continue;
        }
        System.out.println(i);
     }  
   }    
}
