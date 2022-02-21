import java.util.Scanner;

public class Tarifa {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int mbsAllowed = Integer.parseInt(scan.nextLine());
    int months = Integer.parseInt(scan.nextLine());
    int mbsLeftNextMonth = mbsAllowed;

    for (int i = 0; i < months; i++){
      int mbsSpent = Integer.parseInt(scan.nextLine());
      if (mbsSpent <= mbsAllowed){
        mbsLeftNextMonth += mbsAllowed - mbsSpent;
      } else {
        mbsLeftNextMonth -= mbsSpent - mbsAllowed;
      }
    }

    System.out.println(mbsLeftNextMonth);
    scan.close();
  }
}
