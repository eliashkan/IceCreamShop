package be.vdab.sellers;

import be.vdab.application.NoMoreIceCreamException;
import be.vdab.eatables.*;

public class IceCreamCar implements IceCreamSeller{
    private PriceList pricelist;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList pricelist, Stock stock) {
        this.pricelist = pricelist;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Flavour[] balls) throws NoMoreIceCreamException {
        if (stock.getCones() > 0 && stock.getBalls() > 0) {
            Cone orderedCone = new Cone(balls);
            profit += pricelist.getBallPrice() * balls.length;
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - balls.length);
            return orderedCone;
        } else throw new NoMoreIceCreamException("We do not have enough ingredients in stock to make an ice cream cone.");
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        if (stock.getIceRockets() > 0) {
            IceRocket orderedIceRocket = new IceRocket();
            profit += pricelist.getRocketPrice();
            stock.setIceRockets(stock.getIceRockets() - 1);
            return orderedIceRocket;
        } else throw new NoMoreIceCreamException("We do not have any Ice Rockets left in stock.");
    }

    @Override
    public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {
        if (stock.getMagni() > 0) {
                Magnum orderedMagnum = new Magnum(type);
                profit += pricelist.getMagnumPrice(type);
                stock.setMagni(stock.getMagni() - 1);
                return orderedMagnum;
        } else throw new NoMoreIceCreamException("We do not have any Magni left in stock.");
    }

    //Should be used to "clean up"
    /*public Cone prepareCone(Flavour[] balls){}*/
    /*public Cone prepareIceRocket(){}*/
    /*public Cone prepareCone(MagnumType type){}*/

    @Override
    public double getProfit() {
        return profit;
    }
}
