
//check if a number is prime or not by using user input

import java.util.*;
public class prime1 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter number:");
    int num=sc.nextInt();

    if(num==2)
    {
        System.out.println("number is prime");
    }
    else
    {
        boolean isprime = true;
        for(int i=2; i<=Math.sqrt(num); i++) // or i<=num-1
        {
            if(num % i == 0)
            {
                isprime = false;
            } 
        }

        if(isprime == true)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
    }

  }   
}
