package com.epam.model.bouquet;

import com.epam.model.BouquetComponentsParent;

import java.util.*;

/**
 * Class Bouquet describes bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public final class Bouquet extends BouquetComponentsParent {

    /** Extra cost for every bouquet assembled */
    private static final double EXTRA_COST = 1.05;

    /** The factory price of bouquet */
    private double purchasingPrice;

    /** Retail price of the bouquet */
    private double retailPrice;

    /** Total price of all items in the bouquet */
    private double totalPrice;

    /** Quantity of bouquets */
    private int quantity;

    /** Array of all items of bouquet */
    BouquetComponentsParent[] bouquet;


    private Calendar dayOfEntry;

    @Override
    public void setDayOfEntry() {
        this.dayOfEntry = Calendar.getInstance();
    }

    @Override
    public Calendar getDayOfEntry() {
        return dayOfEntry;
    }

    @Override
    public void setRetailPrice() {

        for(BouquetComponentsParent i : this.bouquet) {
            this.retailPrice += i.getRetailPrice();
        }
    }

    @Override
    public void setTotalPrice() {

        for(BouquetComponentsParent i : this.bouquet) {
            this.totalPrice += i.getTotalPrice();
        }
    }

    @Override
    public double getRetailPrice() {
        return retailPrice;
    }

    @Override
    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        if(bouquet.length != 0) {
            String string = "Your bouquet consists of: \n";
            StringBuffer stringBuffer = new StringBuffer(string);
            for(BouquetComponentsParent i : this.bouquet) {
                stringBuffer.append(i.toString() + "\n");
            }
            return stringBuffer.toString() + "\nTotal price of the bouquet is " + getTotalPrice()
                    + "\nYour profit is: " + String.format("%.2f", (getTotalPrice() - getRetailPrice()));
        } else {
            return super.toString();
        }
    }

    /**
     * Constructor Bouquet
     * @param quantity needed quantity of bouquets
     * @param items array of all components needed for make bouquet
     */
    public Bouquet(int quantity, BouquetComponentsParent[] items) {
        this.quantity = quantity;
        this.bouquet = items;
        setRetailPrice();
        setTotalPrice();
        setDayOfEntry();
    }
}
