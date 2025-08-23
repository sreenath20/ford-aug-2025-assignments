package hospital.records;

public class Reception {
    public static void main(String[] args) {
        Patient p = new Patient("Dana", 555, "InsurerX: Policy 99", "Diabetes; Allergies");

        System.out.println("Name (public): " + p.name);
        System.out.println("Hospital ID (default): " + p.hospitalId);

    }
}
