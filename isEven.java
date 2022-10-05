import java.util.InputMismatchException;
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

    public static void main(String[] args) throws InputMismatchException{
        boolean i = true;
        Scanner myScanner = new Scanner(System.in); //create scanner

        while(i) {
            System.out.println("Enter a number");
            try {
                int testNumber = myScanner.nextInt();
                isNumEven(testNumber);
            } catch (Exception e) {
                myScanner.close();
                break;
            }
            
        }
    }
}