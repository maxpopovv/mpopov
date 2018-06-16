package ru.Calculator;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class FitTest {

    @Test
    public void mensWeight() {
        Fit fit = new Fit();
        double weight = fit.mensWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    @Test
    public void womensWeight() {
        Fit fit = new Fit();
        double weight = fit.womensWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}