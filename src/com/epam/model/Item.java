package com.epam.model;

import java.util.Calendar;

/**
 * Created by Nikolai on 07.11.2015.
 */
public abstract class Item implements I_Item{
    public static final double VAT = 1.2;
    private Calendar dayOfEntry;

    public void setDayOfEntry() {
        this.dayOfEntry = Calendar.getInstance();
    }

    public Calendar getDayOfEntry() {
        return dayOfEntry;
    }



}
