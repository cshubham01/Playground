import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      LinkedHashSet <String> lhs = new LinkedHashSet <String> ();
      String m = br.readLine();
      String arr[] = m.split(",");
      for(int i=0; i<arr.length; i++)
      {
        lhs.add(arr[i]);
      }
      System.out.println(lhs);
    }
}