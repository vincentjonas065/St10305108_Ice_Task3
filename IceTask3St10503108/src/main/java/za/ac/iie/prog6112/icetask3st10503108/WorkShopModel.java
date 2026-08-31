/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.icetask3st10503108;

/**
 *
 * @author Student
 */
public class WorkShopModel { 
package workshopmanagement;

/**
 * Model class used to store and populate raw workshop data.
 */
    public String WorkshopName;
    public int Bookings;

    // Constructor to easily initialize model fields
    public WorkshopModel(String workshopName, int bookings) {
        this.WorkshopName = workshopName;
        this.Bookings = bookings;
    }
}

    
}
