package com.epam.model.flowers;

/**
 * Enum FlowerStemLength contains lengths of flower
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public enum FlowerStemLength {
    EXTRA_SHORT(50), SHORT(70), NORMAL(90), LONG(100), EXTRA_LONG(110);

    private final int flowerLength;

    int getFlowerLength() {
        return flowerLength;
    }
    FlowerStemLength(int fLength) {
        this.flowerLength = fLength;
    }
}
