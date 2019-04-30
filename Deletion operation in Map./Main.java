import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      TreeMap <String, String> tm = new TreeMap<String, String>();
      String name;
      String marks;
      int n = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+n);
      for(int i=0; i<n; i++)
      {
        name = br.readLine();
        marks = br.readLine();
        tm.put(name, marks);
      }
      System.out.println(tm);
      String name1 = br.readLine();
      System.out.println("Enter the index to be removed:"+name1);
      tm.remove(name1);
      System.out.println(tm);
      String name2 = br.readLine();
      String value = br.readLine();
      System.out.println("Enter the index to insert:"+name2);
      System.out.println("Enter the value to be inserted:"+value);
      tm.put(name2, value);
      System.out.println(tm);
    }
}