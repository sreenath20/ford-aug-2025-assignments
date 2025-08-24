package day3.Assignment7;

public class Driver {
    public static void main(String[] args) {
        Books[] book = new Books[3];
        book[0] = new AudioBook(" Harry Potter ","XYZ","123456",590.00,"12hr","XYZ");
        book[1]= new PrintedBook("Jungle Book","BCD","234156",250.97,350,"Hard Cover");
        book[2] = new Ebook("Panchatantra","DEF","548723",150.54,"180kb","PDF");
        for(int i =0;i<book.length;i++){
            System.out.println("------------Details of Book "+(i+1)+"---------------");
            book[i].displayDetails();
        }
    }
}
