package za.ac.iie.prog6112.icetask3st10503108;

/**
 *
 * @author vincent
 */
public class OnlineWorkshop extends Workshop {

    public OnlineWorkshop(WorkshopModel model) {
        super(model);
    }

    @Override
    public String GetWorkshopMode() {
        return "ONLINE";
    }
}
