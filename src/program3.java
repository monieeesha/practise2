import java.util.*;
 class Member {

        String name;
        int age;
        float salary;

    Member( String name,int age,float salary)
    {

        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    String getname()
    {
        return name;
    }

    int getage()
    {
        return age;
    }

    float getsalary()
    {
        return salary;
    }

}

class Membervariable
{


    public static void main(String args[])
    {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter the name");
        String s=scan.next();
        System.out.println("enter the age");
        int a=scan.nextInt();
        System.out.println("enter the float");
        float x=scan.nextFloat();
        Member m=new Member(s,a,x);
        System.out.println( m.getname());
        System.out.println( m.getage());
        System.out.println( m.getsalary());




    }


}
