import java.util.Scanner;

public class WasteCollectionVehicleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Vehicle Number (Integer): ");
        int vehicleNumber = scanner.nextInt();

        System.out.print("Enter Waste Collected in kilograms (Decimal): ");
        double wasteCollectedKg = scanner.nextDouble();

        System.out.print("Enter Number of Collection Points (Integer): ");
        int collectionPoints = scanner.nextInt();

        System.out.print("Enter Vehicle Status (Single Character): ");
        char vehicleStatus = scanner.next().charAt(0);

        System.out.println("\n--- Waste Collection Vehicle Details ---");
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Waste Collected (kg): " + wasteCollectedKg);
        System.out.println("Number of Collection Points: " + collectionPoints);
        System.out.println("Vehicle Status: " + vehicleStatus);

        scanner.close();
    }
}
