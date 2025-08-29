import java.util.Comparator;
import java.util.Objects;

public class SlotIdComparator implements Comparator<ParkingSlot>
{

    @Override
    public int compare(ParkingSlot o1, ParkingSlot o2) {
       return Integer.compare(o1.getSlotId(), o2.getSlotId());
    }
}
