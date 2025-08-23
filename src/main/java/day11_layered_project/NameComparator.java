

package day11_layered_project;

import java.util.Comparator;

public class NameComparator implements Comparator<Wallet> {
    public int compare(Wallet w1, Wallet w2) {
        return w1.getName().compareTo(w2.getName());
    }
}
