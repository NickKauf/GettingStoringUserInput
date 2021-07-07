import java.util.Scanner;

public class GettingStoringUserInput {
    public static void main(String [] args){
        Scanner newScanner = new Scanner(System.in); //adding scanner object
        System.out.println("Please enter your name and address: ");
        String firstInitial = newScanner.next();
        String lastName = newScanner.next();
        int houseNumber = newScanner.nextInt();
        String streetName = newScanner.next();
        String streetType = newScanner.next();
        String city = newScanner.next();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
        void close()
    }
}
