import java.util.Scanner;



public class BizzBuzz{

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("This program will simulate a game of BizzBuzz.");
    System.out.println("=============================");
    System.out.println("Enter the positive number up to which you want the game played:");
    int num = sc.nextInt();
    int bizzCounter = 0;
    int buzzCounter = 0;
    int bizzBuzzCounter = 0;

    sc.close();
    for (int i = 1; i <= num; i++){
      if ((i % 3 == 0) && (i % 5 == 0)){
        System.out.println("BizzBuzz");
        bizzBuzzCounter += 1;
      } else if (i % 3 == 0) {
        System.out.println("Bizz");
        bizzCounter += 1;
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
        buzzCounter += 1;
      } else {
        System.out.println(i);
      }
    }
    System.out.println("The number of Bizzes was " + bizzCounter);
    System.out.println("The number of Buzzes was " + buzzCounter);
    System.out.println("And the number of BizzBuzzes was " + bizzBuzzCounter);
    System.out.println("\nThank you for playing Bizz Buzz with me");



  }
}
