import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeSet<String> ts = new TreeSet<String>();
      String m = br.readLine();
      String arr[] = m.split(",");
      for(int i=0; i<arr.length; i++)
      {
        ts.add(arr[i]);
      }
      System.out.println(ts);
      Object arr1[] = ts.toArray();
        int n = arr1.length-1;
        while(ts.isEmpty()!=true)
        {
            Object m1 = arr1[n];
            ts.remove(m1);
            System.out.println(ts);
            --n;
        }
      
    }
}