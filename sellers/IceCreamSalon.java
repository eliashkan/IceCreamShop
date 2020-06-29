package be.vdab.sellers;

import be.vdab.eatables.*;

public class IceCreamSalon implements IceCreamSeller {
    private PriceList priceList;
    private double profit;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Flavour[] balls) {
        Cone orderedCone = new Cone(balls);
        profit += priceList.getBallPrice() * balls.length;
        return orderedCone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket orderedIceRocket = new IceRocket();
        profit += priceList.getRocketPrice();
        return orderedIceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum orderedMagnum = new Magnum(type);
        profit += priceList.getMagnumPrice(type);
        return orderedMagnum;
    }

    @Override
    public double getProfit() {
        return profit;
    }
}
