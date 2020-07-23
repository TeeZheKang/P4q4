
import java.util.Scanner;



public class Test {
    public static void main(String[] args) {
        //todo:: By using array, create 3 CarType object
        CarType[] types = {new CarType("Toyota", "Vios", 1.5), new CarType("Nissan", "Teana", 2.0), new CarType("Honda", "City", 1.6)};
        //todo:: create an array that will able to store 6 registrations
        Registration[] registration = new Registration[2];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < registration.length; ++i) {

            System.out.println("\nRegistration number: " + Registration.getCount());

            //todo:: request and read the owner detail
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();
            System.out.print("IC No: ");
            String ic = scanner.nextLine();

            //construct owner object
            Owner owner = new Owner(name, ic);
            //todo:: request and read car detail
            System.out.print("Enter Car plate Number: ");
            String plate = scanner.nextLine();
            System.out.print("Enter Car color: ");
            String color = scanner.nextLine();
            System.out.print("Enter Car year: ");
            int year = scanner.nextInt();
            System.out.println("\nCar Types: ");

            //todo:: display all available carType
            for (int j = 0; j < types.length; j++) {
                System.out.println((j + 1) + "." + types[j].toString());
            }

            System.out.print("\nSelect car type [1.." + types.length + "]: ");
            int selection = scanner.nextInt();
            Car car = new Car(plate, color, year, types[selection - 1]);
            //todo:: get cartype from array (based on selection)

            //todo:: register the car
            registration[i] = new Registration(owner, car);

            scanner.nextLine();
        }
        displayListing(registration);
        //todo:: display all registration detail

    }

    public static void displayListing(Registration[] regArr) {
        System.out.printf("\n\n%50s\n", "Car Registration Listing");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %15s\n",
                "Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
        for (int i = 0; i < regArr.length; ++i) {
            System.out.println(regArr[i]);
        }
    }
}