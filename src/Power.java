import java.util.*;

 class Power {


    public  static boolean isPower(int  x)
    {
        if(x==0)
            return false;
        while( x!=1)
        {

            if(x%4!=0)
                return false;
             x=x/4;

        }
        return true;
    }

    public static void main(String args[])
    {


        Scanner scan=new Scanner(System.in);

         int a=scan.nextInt();
         boolean s=isPower(a);
         System.out.println(s);



    }
}

