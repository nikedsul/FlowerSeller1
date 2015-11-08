package com.epam.view;


import com.epam.model.Item;
import com.epam.model.accessories.*;
import com.epam.model.flowers.*;
import com.epam.model.bouquet.Bouquet;

import java.util.Objects;

/**
 * Created by Nikolai on 07.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Item bouquet = new Bouquet(
                1,
                new Item[] {
                    new Flower(FlowerNames.ROSE, 3, "red", FlowerStemLength.EXTRA_LONG),
                    new Flower(FlowerNames.ROSE, 2, "white", FlowerStemLength.EXTRA_SHORT),
                    new Flower(FlowerNames.CHRYSANTHEMUM, 5, "white", FlowerStemLength.LONG),
                    new Flower(FlowerNames.CARNATION, 4, "red", FlowerStemLength.NORMAL),
                    new Flower(FlowerNames.TULIP, 5, "yellow", FlowerStemLength.EXTRA_LONG),
                    new Wrapping(2, "red", WrappingMaterials.FELT),
                    new GreetingCard(1, true)
                }
        );
        System.out.println(bouquet.toString());
    }

}
