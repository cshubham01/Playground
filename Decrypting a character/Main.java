import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner (System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      if(ch>='a'&&ch<='z')
      {
        int offset = ch - 'a';
        offset =(char) ((offset -key)%26);
        ch = (char)(offset+'{');
      }
      else
      {
        int offset = ch - 'A';
        offset = (char)((offset -key)%26);
        ch = (char)(offset+'A');
      }
      System.out.print(ch);
          
    }
}