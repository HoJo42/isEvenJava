import java.util.Scanner; // import scanner class

public class isEven {

    public static void isNumEven (int x){
        if (x%2 == 0) { //checks remainder of variable divided by 2
            System.out.println("This number is Even.");
        }
        else {
            System.out.println("This number is Odd");
        }
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //create scanner
        System.out.println("Enter a number");

        int testNumber = myScanner.nextInt();
        isNumEven(testNumber);
        myScanner.close();
    }
}