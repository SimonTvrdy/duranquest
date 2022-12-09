package com.company.entities;

import com.company.GameDif;
import com.company.items.Food;
import com.company.items.Potion;
import com.company.map.GameLocation;

/**
 * Podtřída hráče
 */
public class Player implements Entity{
    /**
     * Jméno hráče
     */
    private final String name = "Tomáš Ďurán";

    @Override
    public void fight() {

    }

    @Override
    public void defence() {

    }

    @Override
    public void dodge() {

    }

    @Override
    public void escape() {

    }

    @Override
    public void heal(Potion potion) {

    }

    @Override
    public void eat(Food food) {

    }

    @Override
    public void moveTo() {

    }

    @Override
    public void moveTo(GameLocation gameLocation) {

    }

    @Override
    public void talkTo(Entity entity) {

    }

    @Override
    public void sleep() {

    }


    public String getName() {
        return name;
    }
}
