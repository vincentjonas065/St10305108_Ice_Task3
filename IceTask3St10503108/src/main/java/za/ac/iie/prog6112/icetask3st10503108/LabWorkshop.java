package za.ac.iie.prog6112.icetask3st10503108;

/**
 *
 * @author Vincent
 */
public class LabWorkshop extends Workshop {

    public LabWorkshop(WorkshopModel model) {
        super(model);
    }

    @Override
    public String GetWorkshopMode() {
        return "LAB";
    }
}
