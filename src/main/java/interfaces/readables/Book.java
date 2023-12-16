package interfaces.readables;

public class Book extends Readable {

    public Book(String name){
        super(name);
    }

    public static void printBooks(Printable[] printable){
        for (Printable prntbl : printable){
            if (prntbl instanceof Book){
                System.out.println(prntbl.toString());
            }
        }
    }
}
