package be.vdab.eatables;

public class Magnum implements Eatable {
    private MagnumType type;

    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("This ice cream is a" +  " Magnum with the flavour of " + this.type.toString());
    }
}
