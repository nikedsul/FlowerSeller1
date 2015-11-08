package com.epam.model.accessories;

import com.epam.model.BouquetComponentsParent;

import java.util.Calendar;

/**
 * Class GreetingCard describes cards for our bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public class GreetingCard extends BouquetComponentsParent {

    /** Volume of the profit for each card in a bouquet */
    private static final double EXTRA_COST = 2.0;

    /** Price of purchase of a card */
    private static final double PURCHASING_PRICE = 5.5;

    /** Retail price of a card */
    private double retailPrice;

    /** Total price of cards in bouquet */
    private double totalPrice;

    /** Quantity of cards in bouquet */
    private int quantity;

    /** Optional text in a card - incur additional charges */
    private boolean text;

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
    public final void setRetailPrice() {
        this.retailPrice = (PURCHASING_PRICE * EXTRA_COST * BouquetComponentsParent.VAT) + (text ? 3.0 : 0);
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
        return "BouquetComponentsParent: Greeting card. With text: " + (text ? "yes" : "no") + ". Quantity: " + getQuantity()
                + ". BouquetComponentsParent price: " + getRetailPrice() + ". Total price: " + getTotalPrice();
    }

    /**
     * Constructor GreetingCard
     * @param quantity number of greeting cards needed
     * @param text with or without text
     */
    public GreetingCard(int quantity, boolean text) {
        this.quantity = quantity;
        this.text = text;
        setRetailPrice();
        setTotalPrice();
        setDayOfEntry();
    }
}
