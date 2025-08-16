//reverse string by using for loop

public class reversestring
 {
    
        public static void main(String[] args)
         {
          String org = "Hello";
          String rev = "";
          System.out.println("Original string: " + org);
              
          for (int i = 0; i < org.length(); i++) 
          {
            rev = org.charAt(i) + rev;
          }
          
          System.out.println("Reversed string: "+ rev);
        }
      }
    