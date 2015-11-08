package com.epam.model.accessories;

import com.epam.model.BouquetComponentsParent;

import java.util.Calendar;

/**
 * Class Wrapping describes wrapping for bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public class Wrapping extends BouquetComponentsParent {

    /** Volume of the profit for each wrapping in a bouquet */
    private static final double EXTRA_COST = 2.0;

    /** Price of purchase of a material */
    private double purchasingPrice;

    /** Retail price of a wrapping material */
    private double retailPrice;

    /** Total price of a wrapping material in a bouquet */
    private double totalPrice;

    /** Quantity of wrapping materials in bouquet */
    private int quantity;

    /** Color of a wrapping material */
    private String color;

    /** Material of wrapping */
    private String material;

    private Calendar dayOfEntry;

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void setDayOfEntry() {

        this.dayOfEntry = Calendar.getInstance();
    }

    @Override
    public Calendar getDayOfEntry() {

        return dayOfEntry;
    }

    @Override
    public final void setRetailPrice() {
        this.retailPrice = this.purchasingPrice * EXTRA_COST * BouquetComponentsParent.VAT;
    }

    @Override
    public double getRetailPrice() {
        return retailPrice;
    }

    @Override
    public void setTotalPrice() {
        totalPrice = this.retailPrice * this.quantity;
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
        return "Component: Wrapping. Material: " + getMaterial() + ". Color: " + getColor() + ". Quantity: "
                + getQuantity() + ". Retail price: " + getRetailPrice() + ". Total price: " + getTotalPrice();
    }

    /**
     * Constructor Wrapping
     * @param quantity of a materials
     * @param color of a material
     * @param material material of wrapping
     */
    public Wrapping(int quantity, String color, WrappingMaterial material) {
        this.quantity = quantity;
        this.color = color;
        this.purchasingPrice = material.materialPurchasingPrice();
        this.material = material.name();
        setRetailPrice();
        setTotalPrice();
        setDayOfEntry();
    }
}
