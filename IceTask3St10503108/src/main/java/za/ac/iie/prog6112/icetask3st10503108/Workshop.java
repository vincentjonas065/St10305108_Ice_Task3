/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.iie.prog6112.icetask3st10503108;

/**
 *
 * @author Student
 */
public abstract class Workshop implements IWorkshop {

    private String workshopName;
    private int bookings;

    public Workshop(WorkshopModel model) {
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
