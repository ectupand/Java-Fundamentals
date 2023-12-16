package interfaces.readables;

public class Readable implements Printable{
    private final String name;

    public Readable(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return getName();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
