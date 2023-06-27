class Main {
  public static void main(String[] args) {
    System.out.println("Enter a word:");
    returnLength();
  }
  
  static public returnLength() {
    Scanner input = new Scanner(System.in);
    return input.nextLine().length();
  }
}
