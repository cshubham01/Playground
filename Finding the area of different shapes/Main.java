import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner (System.in);
       int option = in.nextInt();
       switch(option)
       {
         case 1:
           int side = in.nextInt();
           int Area_square = side * side;
           System.out.println(Area_square);
           break;
         case 2:
           int length = in.nextInt();
           int breadth = in.nextInt();
           System.out.println(length * breadth);
           break;
           
         case 3:
           int base = in.nextInt();
           int height = in.nextInt();
           int Area = (base * height)/2;
           System.out.println(Area);
           break;
           
         case 4:
           int radius = in.nextInt();
           double area = 3.14 * radius * radius;
           System.out.println(area);
           break;
       }
    }
}