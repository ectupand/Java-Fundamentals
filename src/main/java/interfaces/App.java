package interfaces;

import interfaces.readables.Book;
import interfaces.readables.Magazine;
import interfaces.readables.Printable;

public class App {
    public static void main(String[] args) {
        Printable[] readables = new Printable[] {
                new Book("Bookie"),
                new Magazine("Journalius"),
                new Magazine("Jurnal"),
                new Book("Boochok")
        };
        for (Printable readable : readables){
            readable.print();
        }
        Book.printBooks(readables);
        Magazine.printMagazines(readables);
    }
}
