import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int len = sb.length();
    int a[] = {'a','e','i','o','u'};
    StringBuilder temp = new StringBuilder("");
    for(int i=0;i<len;i++)
    {
      int count =0;
      for(int j=0;j<5;j++)
      {
       if(sb.charAt(i)!=a[j])
       {
         count++;
       }
      }
      if(count ==5)
      temp.append(sb.charAt(i));
       }
      System.out.print(temp);
  }
}