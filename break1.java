
//keep entering numbers till users enters a multiple or divide  of 10

import java.util.*;
public class break1 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        do{
           System.out.print("Enter a number:");
           int n = sc.nextInt();
           
           if(n % 10 == 0)
           {
            break;
           }
          System.out.println(n);
        }while(true);
        
    }
}
