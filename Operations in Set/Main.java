import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
      LinkedHashSet <String> lhs = new LinkedHashSet <String> ();
      String m = br.readLine();
      String arr[] = m.split(",");
      for(int i=0; i<arr.length; i++)
      {
        lhs.add(arr[i]);
      }
      System.out.println(lhs);
      String ch1 = br.readLine();
      System.out.println("Enter the value to be deleted: "+ch1);
      lhs.remove(ch1);
      System.out.println(lhs);
      String ch2 = br.readLine();
      System.out.println("Enter the value to be added: "+ ch2);
      lhs.add(ch2);
      System.out.println(lhs);
      
    }
}