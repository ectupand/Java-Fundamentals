package interfaces;

import interfaces.readables.Book;
import interfaces.readables.Magazine;
import interfaces.readables.Printable;

import static interfaces.readables.Book.printBooks;

public class App {
    public static void main(String[] args) {
        Printable[] readables = new Printable[4];
        Book book1 = new Book("Bookie");
        Magazine magazine1 = new Magazine("Journalius");
        Magazine magazine2 = new Magazine("Jurnal");
        Book book2 = new Book("Boochok");
        readables[0] = book1;
        readables[1] = magazine1;
        readables[2] = magazine2;
        readables[3] = book2;
        for (Printable readable : readables){
            readable.print();
        }
        Book.printBooks(readables);
        Magazine.printMagazines(readables);
    }
}
