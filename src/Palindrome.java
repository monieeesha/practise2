import java.util.*;

public class Palindrome {


       public  static String checkString(String x)
       {
           String rev="";

          for(int i=x.length()-1;i>=0;i--)
          {

              rev=rev+x.charAt(i);
          }

           if(x.equals(rev))
               return "palindrome";
           else
               return  "not a palindrome";



       }

    public static void main(String args[])
    {



        Scanner scan=new Scanner(System.in);

        String a=scan.next();

       String x= checkString(a);
       System.out.println(x);
    }
}
