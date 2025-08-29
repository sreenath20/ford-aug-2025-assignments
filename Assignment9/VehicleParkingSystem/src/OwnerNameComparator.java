import java.util.Comparator;
import java.util.Objects;

public class OwnerNameComparator implements Comparator<Vehicle> {


    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o1.getOwnerName().compareTo(o2.getOwnerName());
    }
}
