import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner (System.in);
      int row = in.nextInt();
      int column = in.nextInt();
      for(int i=0;i<row;i++)
      {
        for(int j=column; j>column-i; j--)
        {
          System.out.print(j);
        }
        for(int k=0;k<row-i;k++)
        {
          System.out.print(row-i);
        }
        System.out.println();
      }
    }
}