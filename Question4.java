import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();

    for(int i = num ; i >= 1; i--){
      for (int n = 1; n <= i; n++){
        System.out.print("*");
      }
      System.out.println();
    
  }
}
