import java.util.Scanner;
import java.io.*;

public class program4
{
    public static void main(String[] input)
    {
        String fname;
        Scanner scan = new Scanner(System.in);



        System.out.print("Enter File Name to Open (with extension like file.txt) : ");
        fname = scan.nextLine();



        String line = null;
        try
        {

            FileReader fileReader = new FileReader(fname);


            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null)
            {

                String upper = line.toUpperCase();
                System.out.println(upper);
            }


            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}
