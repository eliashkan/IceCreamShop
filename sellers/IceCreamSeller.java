package be.vdab.sellers;

import be.vdab.application.NoMoreIceCreamException;
import be.vdab.eatables.*;

public interface IceCreamSeller extends Profitable {
    Cone orderCone(Flavour[] balls) throws NoMoreIceCreamException;
    IceRocket orderIceRocket() throws NoMoreIceCreamException;
    Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException;
}
