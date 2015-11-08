package com.epam.model;

/**
 * Interface PriceMakeable install the behaviour of all components of bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public interface PriceMakeable {
    void        setRetailPrice();
    void        setTotalPrice();
    double      getRetailPrice();
    double      getTotalPrice();
    int         getQuantity();
}
