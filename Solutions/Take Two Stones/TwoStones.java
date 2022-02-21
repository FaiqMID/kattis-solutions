import java.util.Scanner;

public class TwoStones {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int stoneCount = scan.nextInt();
    System.out.print((stoneCount % 2) == 0 ? "Bob" : "Alice");
    scan.close();
  }
}
