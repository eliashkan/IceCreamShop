package be.vdab.sellers;

import be.vdab.eatables.MagnumType;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    public PriceList() {
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(MagnumType type) {
        double adjustedMagnumPrice = magnumStandardPrice;
        switch (type) {
            //The first 3 flavours use the standard Magnum price
            case MILKCHOCOLATE:
            case BLACKCHOCOLATE:
            case WHITECHOCOLATE:
                break;
            case ALPINENUTS:
                adjustedMagnumPrice *= 1.5;
                break;
            case ROMANTICSTRAWBERRIES:
                adjustedMagnumPrice *= 1.75;
        }
        return adjustedMagnumPrice;
    }
}
