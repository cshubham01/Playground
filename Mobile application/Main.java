class MyModel1 {
  void display(){
      System.out.println("Features of MyModel 1");
      System.out.println("Camera mega pixels: 2");
  }
}
class MyModel2 extends MyModel1 {
  void display(){
      System.out.println("Features of MyModel 2");
      System.out.println("Camera mega pixels: 5");
      System.out.println("Lock mechanism: Fingerprint");
      System.out.println("Display size: 5");
  }
}
class MyModel2T extends MyModel2 {
  void display(){
      System.out.println("Features of MyModel 2T");
      System.out.println("Camera mega pixels: 16");
      System.out.println("Lock mechanism: Fingerprint");
      System.out.println("Display size: 6");
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
        MyModel1 obj1 = new MyModel1();
        obj1.display();
        MyModel2 obj2 = new MyModel2();
        obj2.display();
        MyModel2T obj3 = new MyModel2T();
        obj3.display();

    }
}