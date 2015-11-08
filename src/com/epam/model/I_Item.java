package com.epam.model;

/**
 * Interface I_Item install the behaviour of all components of bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public interface I_Item {
    void        setRetailPrice();
    void        setTotalPrice();
    double      getRetailPrice();
    double      getTotalPrice();
    int         getQuantity();
}
