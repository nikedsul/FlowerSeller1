package com.epam.model.flowers;

/**
 * Created by Nikolai on 08.11.2015.
 */
public enum FlowerStemLength {
    EXTRA_SHORT(50), SHORT(70), NORMAL(90), LONG(100), EXTRA_LONG(110);

    private final int fLength;

    int fLength() {
        return fLength;
    }
    FlowerStemLength(int fLength) {
        this.fLength = fLength;
    }
}
