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

    private final String WorkshopName;
    private final int Bookings;

    public Workshop(WorkshopModel model) {
        this.WorkshopName = model.WorkshopName;
        this.Bookings = model.Bookings;
    }

    @Override
    public String GetWorkshopName() {
        return WorkshopName;
    }

    @Override
    public int GetBookings() {
        return Bookings;
    }

    public abstract String GetWorkshopMode();

    public int getBookings() {
        return Bookings;
    }

    public String getWorkshopName() {
        return WorkshopName;
    }
}
