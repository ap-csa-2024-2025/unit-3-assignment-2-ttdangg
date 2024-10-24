import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    // Problem 1
    // System.out.println("Enter a double: ");
    // double doub = sc.nextDouble();
    // if (doub == 12.345)
    // {
    //   System.out.println("YES");
    // }


    // Problem 2
    // System.out.println("Enter an integer: ");
    // int intNum = sc.nextInt();
    // if (intNum == 48)
    // {
    //   System.out.println("YES");
    // }



    // Problem 3
    // System.out.println("Enter two integers: ");
    // int num1 = sc.nextInt();
    // int num2 = sc.nextInt();

    // if (num2 == (num1*2))
    // {
    //   System.out.println("YES");
    // }



    // Problem 4
    System.out.println("Enter an integer: ");
    int divisNum = sc.nextInt();

    if (divisNum%2 == 0)
    {
      System.out.println("Divisible by 2!");
    }
    if (divisNum%3 == 0)
    {
      System.out.println("Divisible by 3!")
    }
    if (divisNum%2 == 0 && divisNum%3 == 0)



  }

}
