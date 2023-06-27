import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Enter a word:");
    returnLength();
  }
  
  public static int returnLength() {
    Scanner input = new Scanner(System.in);
    System.out.println(input.nextLine().length());
    return input.nextLine().length();
  }
}
