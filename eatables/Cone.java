package be.vdab.eatables;

import java.util.Arrays;

public class Cone implements Eatable {
    private Flavour[] balls;

    public Cone() {
    }

    public Cone(Flavour[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("This ice cream is a cone with these flavors: " + Arrays.toString(this.balls));

    }
}
