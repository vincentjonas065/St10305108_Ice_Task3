package za.ac.iie.prog6112.icetask3st10503108;

/**
 *
 * @author YourName
 */



public class RunApplication {

    public static void main(String[] args) {

        // Create workshop models
        WorkshopModel model1 = new WorkshopModel("Java Fundamentals", 28);
        WorkshopModel model2 = new WorkshopModel("Web Programming", 16);
        WorkshopModel model3 = new WorkshopModel("Database Design", 34);

        // Store different workshop types in one polymorphic array
        Workshop[] workshops = {
            new LabWorkshop(model1),
            new OnlineWorkshop(model2),
            new LabWorkshop(model3)
        };

        // Display workshop information
        for (Workshop workshop : workshops) {
            System.out.println(
                workshop.GetWorkshopName() + " - "
                + workshop.GetBookings() + " bookings - "
                + workshop.GetWorkshopMode()
            );
        }

        // Store booking totals in a one-dimensional array
        int[] bookingTotals = {
            workshops[0].GetBookings(),
            workshops[1].GetBookings(),
            workshops[2].GetBookings()
        };

        // Bubble sort the booking totals in ascending order
        for (int i = 0; i < bookingTotals.length - 1; i++) {
            for (int j = 0; j < bookingTotals.length - 1 - i; j++) {
                if (bookingTotals[j] > bookingTotals[j + 1]) {
                    int temp = bookingTotals[j];
                    bookingTotals[j] = bookingTotals[j + 1];
                    bookingTotals[j + 1] = temp;
                }
            }
        }

        // Display sorted booking totals
        System.out.println("Sorted booking totals:");

        for (int total : bookingTotals) {
            System.out.print(total + " ");
        }
    }
}
