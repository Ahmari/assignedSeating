import java.util.Scanner;

class Main {
  public static void main(String[] args) {


    // Create an array of 15 int elements
    int[] studentSeats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

    // Create a String array of 15 elements
    String[] names = new String[15];
    Scanner scan = new Scanner(System.in);

    // Use a For loop to loop through the String array
    // Within the For loop, you will want to ask for the student's name (print
    // statement), receive the name(Scanner) and assign it to each element of the
    // String array
    for (int i = 0; i <= 14; i++) {
      System.out.println("What's your first name?");
      names[i] = scan.next();
    }

    // Afterwards, you will need to use a While loop to print each element in the
    // String array along with each element in the int array
    int count = 0;
    while (count <= 14) {
      System.out.println(names[count] + " sits in seat #" + studentSeats[count]);
      count++;
    }

  }

}