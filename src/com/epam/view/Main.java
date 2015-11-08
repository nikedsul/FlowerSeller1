package com.epam.view;


import com.epam.model.BouquetComponentsParent;
import com.epam.model.accessories.*;
import com.epam.model.flowers.*;
import com.epam.model.bouquet.Bouquet;

/**
 * Class Main print out information in console
 * @author  Mykola Sultan
 * @version 1.00 08 november 2015
 */
public class Main {
    public static void main(String[] args) {
        BouquetComponentsParent bouquet = new Bouquet(
                1,
                new BouquetComponentsParent[] {
                    new Flower(FlowerName.ROSE, 3, "red", FlowerStemLength.EXTRA_LONG),
                    new Flower(FlowerName.ROSE, 2, "white", FlowerStemLength.EXTRA_SHORT),
                    new Flower(FlowerName.CHRYSANTHEMUM, 5, "white", FlowerStemLength.LONG),
                    new Flower(FlowerName.CARNATION, 4, "red", FlowerStemLength.NORMAL),
                    new Flower(FlowerName.TULIP, 5, "yellow", FlowerStemLength.EXTRA_LONG),
                    new Wrapping(2, "red", WrappingMaterial.FELT),
                    new GreetingCard(1, true)
                }
        );
        System.out.println(bouquet.toString());
    }

}
