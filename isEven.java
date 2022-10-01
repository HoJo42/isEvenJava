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
        boolean i = true;
        Scanner myScanner = new Scanner(System.in); //create scanner
    do {
        
        System.out.println("Enter a number");

        int testNumber = myScanner.nextInt();
        isNumEven(testNumber);
        String exitCase = myScanner.nextLine();
        if (exitCase.toLowerCase() == "exit"){
            i = false;
        }
        //myScanner.close();
    } while (i);
    }
}