import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2  = scan.nextLine();
    int len1 = str2.length();
    StringBuilder sb = new StringBuilder(str1);
    int len = sb.length();
    StringBuilder temp = new StringBuilder("");
    for (int i=0;i<len1;i++)
    {
      Boolean is = false;
      for(int j=0;j<len;j++)
      {
        if((sb.charAt(j)==str2.charAt(i))&&(sb.charAt(j)!=' '))
        {
          sb.setCharAt(j,' ');
        }
      }
    }
      for(int i=0;i<len;i++)
      {
        if(sb.charAt(i)!=' ')
        {
          System.out.print(sb.charAt(i));
        
        }
     
    }
  }
}