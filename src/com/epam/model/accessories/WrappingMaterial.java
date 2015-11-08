package com.epam.model.accessories;

/**
 * Enum WrappingMaterial contains names of wrapping material and its purchasing price
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public enum WrappingMaterial {
    PAPER(2.0), TRANSPARENT_FILM(1.8), SISAL(3.5), FELT(5.2);

    /** Price of purchase of a material */
    private double purchasingPrice;

    double materialPurchasingPrice() {
        return  purchasingPrice;
    }

    /**
     * Constructor WrappingMaterial
     * @param purchasingPrice Price of purchase of a material
     */
    WrappingMaterial(double purchasingPrice) {
        this.purchasingPrice = purchasingPrice;
    }
}
