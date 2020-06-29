package be.vdab.application;

import be.vdab.eatables.*;
import be.vdab.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) throws NoMoreIceCreamException {
        PriceList priceList = new PriceList(0.75, 1.5, 1.5);
        Stock iceCreamStock = new Stock(1, 8, 8, 2);

        IceCreamCar iceCreamCar = new IceCreamCar(priceList, iceCreamStock);

        IceRocket boughtIceRocket = iceCreamCar.orderIceRocket();
        Magnum boughtMagnum = iceCreamCar.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES);
        Cone boughtCone = iceCreamCar.orderCone(new Flavour[]{Flavour.MOCHA, Flavour.STRACCIATELLA, Flavour.LEMON});

        Eatable[] orderedIceCreams = {boughtCone, boughtIceRocket, boughtMagnum};
        for (int i = 0; i < orderedIceCreams.length; i++) {
            orderedIceCreams[i].eat();
        }

        System.out.println("You have made a profit of €" + iceCreamCar.getProfit());
    }
}
