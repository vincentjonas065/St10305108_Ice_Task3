/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.iie.prog6112.icetask3st10503108;

/**
 *
 * @author Student
 */
package workshopmanagement;

/**
 * Subclass representing a workshop delivered online.
 */
public class OnlineWorkshop extends Workshop {

    public OnlineWorkshop(WorkshopModel model) {
        super(model); // Calls the superclass constructor
    }

    @Override
    public String GetWorkshopMode() {
        return "ONLINE";
    }
}

    
}
