import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner scan = new Scanner (System.in);
      String str = scan.nextLine();
      int len = str.length();
      int stat[]= new int [26];
      for(int i=0;i<26;i++)
      {
        stat[i] = 0;
      }
      for(int i=0;i<len;i++)
      {
        if((str.charAt(i)>='a')&&(str.charAt(i)<='z'))
        {
          int offset = str.charAt(i) - 'a';
          stat[offset]--;
        }
        else if((str.charAt(i)>='A')&&(str.charAt(i)<='Z'))
        {
          int offset = str.charAt(i) -'A';
          stat[offset]--;
        }
      }
      for(int i=0;i<26;i++)
      {
        if(stat[i]==0)
        {
          char offset = (char)(i + 'a');
          System.out.print(offset+ " ");
        }
      }
   }
}