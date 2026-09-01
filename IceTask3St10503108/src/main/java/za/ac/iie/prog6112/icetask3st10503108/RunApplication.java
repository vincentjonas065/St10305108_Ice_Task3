package za.ac.iie.prog6112.icetask3st10503108;

/**
 *
 * @author YourName
 */
public class RunApplication {

    public static void main(String[] args) {

        // Create the workshop models
        WorkshopModel javaFundamentals
                = new WorkshopModel("Java Fundamentals", 28);

        WorkshopModel webProgramming
                = new WorkshopModel("Web Programming", 16);

        WorkshopModel databaseDesign
                = new WorkshopModel("Database Design", 34);

        // Create a Workshop array containing Lab and Online workshops
        Workshop[] workshops = {
            new LabWorkshop(javaFundamentals),
            new OnlineWorkshop(webProgramming),
            new LabWorkshop(databaseDesign)
        };

        // Display the workshop details
        System.out.println("Workshop Summary");

        for (Workshop workshop : workshops) {
            System.out.println(
                    workshop.GetWorkshopName()
                    + " - "
                    + workshop.GetBookings()
                    + " bookings - "
                    + workshop.GetWorkshopMode()
            );
        }

        // Create an array to store the booking totals
        int[] bookingTotals = new int[workshops.length];

        // Copy booking totals into the array
        for (int i = 0; i < workshops.length; i++) {
            bookingTotals[i] = workshops[i].GetBookings();
        }

        // Bubble sort the booking totals in ascending order
        for (int i = 0; i < bookingTotals.length - 1; i++) {

            for (int j = 0; j < bookingTotals.length - 1 - i; j++) {

                if (bookingTotals[j] > bookingTotals[j + 1]) {

                    int temporary = bookingTotals[j];
                    bookingTotals[j] = bookingTotals[j + 1];
                    bookingTotals[j + 1] = temporary;
                }
            }
        }

        // Display the sorted booking totals
        System.out.println();
        System.out.println("Booking totals in ascending order:");

        for (int i = 0; i < bookingTotals.length; i++) {
            System.out.print(bookingTotals[i] + " ");
        }
    }
}
