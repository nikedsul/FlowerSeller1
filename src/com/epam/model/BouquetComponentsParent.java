package com.epam.model;

import java.util.Calendar;

/**
 * Class BouquetComponentsParent is parent of all possible components of a bouquet
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public abstract class BouquetComponentsParent implements PriceMakeable {
    public static final double VAT = 1.2;
    private Calendar dayOfEntry;

    public void setDayOfEntry() {
        this.dayOfEntry = Calendar.getInstance();
    }

    public Calendar getDayOfEntry() {
        return dayOfEntry;
    }
}
