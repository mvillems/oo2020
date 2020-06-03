package app;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Tests {
    Drink drink = new Drink("water", 1, 1000);
    Bottle bottle = new Bottle(1, 0.1, BottleType.PLASTIC);
    Barrel barrel = new Barrel(3);

    @Before
    public void init() {
        drink = new Drink("water", 1, 1000);
        bottle = new Bottle(1, 0.1, BottleType.PLASTIC);
        barrel = new Barrel(3);
        barrel.addDrink(drink);
    }

    @Test
    public void test1() {
        assertEquals(null, bottle.getDrink());
    }

    @Test
    public void test2() {
        bottle.addDrink(drink);
        assertEquals(drink, bottle.getDrink());
    }

    @Test
    public void test3() {
        bottle.addDrink(drink);
        assertEquals(1005, bottle.getFullMass(), 0.01);
    }

    @Test
    public void test4() {
        bottle.addDrink(drink);
        assertEquals(1.1, bottle.getFullPrice(), 0.01);
    }

    @Test
    public void test5() {
        barrel.fillBottle(bottle);
        assertEquals(2, barrel.getDrinkInside(), 0.01);
    }

    @Test
    public void test6() {
        Barrel b1 = new Barrel(0.7);
        b1.addDrink(drink);
        b1.fillBottle(bottle);
        assertEquals(0.7, bottle.getDrinkInside(), 0.01);
        assertEquals(0, b1.getDrinkInside(), 0.01);
    }

    @Test
    public void test7() {
        List<Bottle> bottles = new ArrayList<>();
        bottles = barrel.emptyToBottles();
        assertEquals(3, bottles.size());
    }
}