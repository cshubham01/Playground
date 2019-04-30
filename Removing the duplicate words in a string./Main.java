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
    String[] words = str.split(" ");
    StringBuilder temp = new StringBuilder("");
    for(int i=0;i<words.length;i++)
    {
      if(words[i] != null)
      {
      for(int j=i+1;j<words.length;j++)
      {
      if(words[i].equals( words[j]))
      {
        words[j] = null;
      }
      }
      }
      }
    for(int i=0;i<words.length;i++)
    {
      if(words [i]!=null)
      {
        System.out.print(words[i]+" ");
      }
    }
    }
}
