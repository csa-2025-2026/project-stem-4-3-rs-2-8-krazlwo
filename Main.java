import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    //Problem 1
    int counter = 1;
    for (int count = 1; count <= 25; count+=2)
    {
      System.out.println(count);
    }

    //Problem 2
    int c = 1;
    for (int i = 17; i <= 73; i++)
    {
      System.out.println(i + " ");

      if (c == 10)
    {
      System.out.println();
      c = 0;
    }
    c++;
    }
    //Problem 3
    System.out.println("Enter number");
    int theinput = 23;
    int cr = 1;
    for (int e = theinput; e <= 50; e++)
    {
      System.out.print(e + " ");
  

      if (cr -- 5)
      {
        cr = 0;
        System.out.println();
      }
    }

  }
}
