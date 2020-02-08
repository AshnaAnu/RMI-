import java.io.*;
import java.rmi.*;
public class AddClient
{
    public static void main(String[]args)
    {
        try
        {
            System.out.println("enter the first number");
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String msg1=br.readLine();
             System.out.println("the first number is"+msg1);
             int d1=Integer.parseInt(msg1);
             System.out.println("enter the second number");
             BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
             String msg2=br1.readLine();
             System.out.println("the second  number is"+msg2);
             int d2=Integer.parseInt(msg2);
             String addServerURL="rmi://localhost/AddServer";
             AddServerIntf addserverintf=(AddServerIntf)Naming.lookup(addServerURL);
             System.out.println("the sum is:"+ addserverintf.add( d1,d2));


        }
        catch(Exception e)
        {
            System.out.println("exception :"+e);
        }
    }
}