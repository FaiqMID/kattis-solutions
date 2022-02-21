import java.util.Scanner;

class ElectricalOutlets {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int lineCount = Integer.parseInt(scan.nextLine());

    for (int i = 0; i < lineCount; i++){
      String[] outletNumbers = scan.nextLine().split(" ");
      int total = 1;
      for (int j = 1; j < outletNumbers.length; j++){
        total += (Integer.parseInt(outletNumbers[j]) - 1);
      }
      System.out.println(total);
    }
    
    scan.close();
  }
}