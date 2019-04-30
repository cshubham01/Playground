import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int b = in.nextInt();
       int exp = in.nextInt();
       int count = 1, value = 1;
       while(count <= exp)
       {
         value = value * b;
         count++;
       }
      System.out.println(value);
    }
}