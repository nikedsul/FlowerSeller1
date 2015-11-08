package com.epam.model.flowers;

import com.epam.model.BouquetComponentsParent;

import java.util.Calendar;

/**
 * Class Rose describes objects Rose
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public final class Flower extends BouquetComponentsParent {

    /** Purchasing price of this type of flower */
    private double purchasingPrice;

    /** Extra cost fo this type of flower */
    private double extraCost; // Formatted in percents (here 50%)

    /** Retail price of this type of flower */
    private double retailPrice;

    /** Total price of several flowers of this type */
    private double totalPrice;

    private String flowerName;

    /** Quantity of this type of flowers of the specified color */
    private int quantity;

    /** Chosen color of this type of flowers */
    private String color;

    /** Chosen stemLength of flowers */
    private int stemLength;

    /** You can choose the date of entry of the type of flowers in warehouse */
    private Calendar dayOfEntry;

    public String getFlowerName() {
        return flowerName;
    }

    public String getColor() {

        return color;
    }

    public int getStemLength() {

        return stemLength;
    }

    @Override
    public void setDayOfEntry() {
        super.setDayOfEntry();
    }

    @Override
    public Calendar getDayOfEntry() {
        return super.getDayOfEntry();
    }

    @Override
    public final void setRetailPrice() {

        this.retailPrice = purchasingPrice * extraCost * BouquetComponentsParent.VAT;
    }

    @Override
    public double getRetailPrice() {

        return retailPrice;
    }

    @Override
    public void setTotalPrice() {

        totalPrice = retailPrice * quantity;
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
        return "BouquetComponentsParent: " + getFlowerName() + ". Color: " + getColor() + ". Quantity: " + getQuantity()
                + ". BouquetComponentsParent price: " + String.format("%.2f", getRetailPrice())
                + ". Total price: " + String.format("%.2f", getTotalPrice());
    }

    /**
     * Constructor Rose
     * @param quantity quantity of this type of flowers of chosen color in a bouquet
     * @param color chosen color of this type of flowers
     * @param stemLength chosen length of this type of flowers in a bouquet
     */
    public Flower(FlowerNames flowerName, int quantity, String color, FlowerStemLength stemLength) {
        this.flowerName = flowerName.getFlowerName();
        this.purchasingPrice = flowerName.flowerPurchasingPrice();
        this.extraCost = flowerName.getExtraCost();
        this.quantity = quantity;
        this.color = color;
        this.stemLength = stemLength.fLength();
        setRetailPrice();
        setTotalPrice();
        setDayOfEntry();
    }
}
