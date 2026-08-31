package za.ac.iie.prog6112.icetask3st10503108;

public abstract class WorkShop implements IWorkShop {
    private String workshopName;
    private int bookings;

    public WorkShop(WorkShopModel model) {
        this.workshopName = model.WorkshopName;
        this.bookings = model.Bookings;
    }

    @Override
    public String GetWorkshopName() {
        return workshopName;
    }

    @Override
    public int GetBookings() {
        return bookings;
    }

    public abstract String GetWorkshopMode();
}