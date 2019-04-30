import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner (System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    int len = sb.length();
    StringBuilder temp = new StringBuilder("");
    for(int i=len/2;i<len;i++)
    {
      temp.append(sb.charAt(i));
    }
    for(int i=0;i<len/2;i++)
    {
      temp.append(sb.charAt(i));
    }
    for(int i=1;i<=len;i++)
    {
      for(int space=1;space<=len-i;space++)
      {
        System.out.print(" ");
      }
      for(int j=0;j<i;j++)
      {
       System.out.print(temp.charAt(j));
      }
      System.out.println();
    }
  }
}