import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a word:");
    String input = scanner.nextLine();
    System.out.println(input.length());
  }
}
