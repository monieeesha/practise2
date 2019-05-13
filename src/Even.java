import java.util.*;

    public class Even {


        public  static boolean isEven(int x)
        {

            if(x%2==0)
                return true;
            else
                return false;
        }

        public static void main(String args[])
        {



            Scanner scan=new Scanner(System.in);

            int a=scan.nextInt();

            boolean x=isEven(a);
            System.out.println(x);



        }
    }


