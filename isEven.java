public class isEven {

    public static void isNumEven (int x){
        if (x%2 == 0) {
            System.out.println("This number is Even.");
        }
        else {
            System.out.println("This number is Odd");
        }
    }

    public static void main(String[] args) {
        isNumEven(3);
    }
}