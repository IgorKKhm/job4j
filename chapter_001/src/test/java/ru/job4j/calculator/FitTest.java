package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double height = 187;
        double expected = 100;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.05);
    }

    @Test
    public void womanWeight() {
        double height = 170;
        double expected = 69;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.05);
    }
}
