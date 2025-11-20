import java.util.Scanner;

//This program shows the capital of selected countries
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Country Capital Finder");
        System.out.println("Supported countries: " + CapitalFinder.listCountries());

        System.out.print("Enter a country name: ");
        String input = scanner.nextLine();

        String capital = CapitalFinder.getCapital(input);

        System.out.println("Capital: " + capital);
    }
}
