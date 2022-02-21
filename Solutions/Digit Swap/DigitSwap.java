import java.util.Scanner;

public class DigitSwap {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    if (input.matches("^(?=[0-9]+)\\d{2}$")){
      int firstDigit, secondDigit, temp;
      int number = Integer.parseInt(input);
      firstDigit = number / 10;
      secondDigit = number % 10;
      
      //swap
      temp = firstDigit;
      firstDigit = secondDigit;
      secondDigit = temp;

      number = firstDigit*10 + secondDigit;
      System.out.println(number);
    } else {
      System.out.println("Input isn't a number or exceeds 2 digits!!!");
    }

    scan.close();
  }
}