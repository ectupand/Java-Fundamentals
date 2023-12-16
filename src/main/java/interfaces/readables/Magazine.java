package interfaces.readables;

public class Magazine extends Readable{

    public Magazine(String name){
        super(name);
    }

    public static void printMagazines(Printable[] printable){
        for (Printable prntbl : printable){
            if (prntbl instanceof Magazine){
                System.out.println(prntbl.toString());
            }
        }
    }
}
