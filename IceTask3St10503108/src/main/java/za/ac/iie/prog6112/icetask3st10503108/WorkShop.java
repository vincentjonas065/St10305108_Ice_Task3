/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.icetask3st10503108;

/**
 *
 * @author Student
 */


/**
 * Abstract class implementing IWorkshop to encapsulate shared workshop fields and behavior.
 */
public abstract class Workshop implements IWorkshop {
    // Private fields for data hiding / encapsulation
    private String workshopName;
    private int bookings;

    // Constructor accepts a WorkshopModel object and initializes private fields
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

    // Abstract method to be overridden by subclasses to demonstrate dynamic method binding
    public abstract String GetWorkshopMode();
}

