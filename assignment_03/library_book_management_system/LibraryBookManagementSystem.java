package assignment_03.library_book_management_system;

public class LibraryBookManagementSystem {
    public static void main(String[] args) {
        System.out.println(" Welcome to Book Management System! \n");

        System.out.println("--- Creating Individual Books ---\n");

        PrintedBook printedBook = new PrintedBook("Harry Potter", "J.K. Rowling", "978-0439708180", 375.0, 320, "Hardcover");
        EBook eBook = new EBook("Digital Fortress", "Dan Brown", "978-0312263126", 9.99, 2.5, "PDF");
        AudioBook audioBook = new AudioBook("The Alchemist", "Paulo Coelho", "978-0061122415", 12.99, 4.5, "Jeremy Irons");

        printedBook.displayDetails();
        System.out.println();
        eBook.displayDetails();
        System.out.println();
        audioBook.displayDetails();
        System.out.println();

        System.out.println("--- Creating Book Arrays ---\n");

        PrintedBook[] printedBooks = {
                new PrintedBook("The Girl Who Drank the Moon", "Kelly Barnhill", "978-1616205676", 450.00, 386, "Hardcover"),
                new PrintedBook("The Palace of Illusions", "Chitra Banerjee Divakaruni", "978-0307281876", 350.00, 360, "Paperback"),
                new PrintedBook("Three Mistakes of My Life", "Chetan Bhagat", "978-8129135490", 150.00, 254, "Paperback")
        };

        EBook[] eBooks = {
                new EBook("The Power of Positive Thinking", "Norman Vincent Peale", "978-0743234801", 225.00, 2.3, "EPUB"),
                new EBook("The Monk Who Sold His Ferrari", "Robin Sharma", "978-8179925911", 350.00, 2.5, "MOBI"),
                new EBook("Think and Grow Rich", "Napoleon Hill", "978-1585424337", 175.00, 3.1, "PDF")
        };

        AudioBook[] audioBooks = {
                new AudioBook("Rich Dad Poor Dad", "Robert Kiyosaki", "978-1612680194", 399.00, 6.1, "Tim Wheeler"),
                new AudioBook("My Story", "Kamala Das", "978-8171674183", 325.00, 9.4, "Priya Krishnan"),
                new AudioBook("You Can Win", "Shiv Khera", "978-8129135728", 350.00, 7.3, "Shiv Khera")
        };

        System.out.println("--- PRINTED BOOKS COLLECTION ---");
        for (int i = 0; i < printedBooks.length; i++) {
            System.out.println("Printed Book " + (i + 1) + ":");
            printedBooks[i].displayDetails();
            System.out.println();
        }

        System.out.println("--- E-BOOKS COLLECTION ---");
        for (int i = 0; i < eBooks.length; i++) {
            System.out.println("E-Book " + (i + 1) + ":");
            eBooks[i].displayDetails();
            System.out.println();
        }

        System.out.println("--- AUDIO BOOKS COLLECTION ---");
        for (int i = 0; i < audioBooks.length; i++) {
            System.out.println("Audio Book " + (i + 1) + ":");
            audioBooks[i].displayDetails();
            System.out.println();
        }

        System.out.println("--- INVENTORY SUMMARY ---");

        double printedTotal = 0;
        for (int i = 0; i < printedBooks.length; i++) {
            printedTotal += printedBooks[i].getPrice();
        }

        double eBookTotal = 0;
        for (int i = 0; i < eBooks.length; i++) {
            eBookTotal += eBooks[i].getPrice();
        }

        double audioBookTotal = 0;
        for (int i = 0; i < audioBooks.length; i++) {
            audioBookTotal += audioBooks[i].getPrice();
        }

        System.out.println("Total Printed Books: " + printedBooks.length + " (Value: Rs." + printedTotal + ")");
        System.out.println("Total E-Books: " + eBooks.length + " (Value: Rs." + eBookTotal + ")");
        System.out.println("Total Audio Books: " + audioBooks.length + " (Value: Rs." + audioBookTotal + ")");
        System.out.println("Total Inventory Value: Rs." + (printedTotal + eBookTotal + audioBookTotal));
    }
}
