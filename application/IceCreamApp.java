package be.vdab.application;

import be.vdab.eatables.*;
import be.vdab.sellers.*;

public class IceCreamApp {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(0.75, 1.5, 1.5);

        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);

        IceRocket boughtIceRocket = iceCreamSalon.orderIceRocket();
        Magnum boughtMagnum = iceCreamSalon.orderMagnum(MagnumType.WHITECHOCOLATE);
        Cone boughtCone = iceCreamSalon.orderCone(new Flavour[]{Flavour.MOCHA, Flavour.STRACCIATELLA, Flavour.LEMON});

        Eatable[] orderedIceCreams = {boughtCone, boughtIceRocket, boughtMagnum};
        for (int i = 0; i < orderedIceCreams.length; i++) {
            orderedIceCreams[i].eat();
        }

        System.out.println("You have made a profit of €" + iceCreamSalon.getProfit());
    }
}
