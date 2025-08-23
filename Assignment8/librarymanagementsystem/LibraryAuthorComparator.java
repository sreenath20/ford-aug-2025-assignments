package Assignment8.librarymanagementsystem;

import java.util.Comparator;

public class LibraryAuthorComparator implements Comparator<Library> {
    @Override
    public int compare(Library l1, Library l2) {
        return l1.getAuthor().compareTo(l2.getAuthor());
    }

}
