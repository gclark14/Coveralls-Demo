package com.evisions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by gabe.clark on 7/11/17.
 */
public class AddAndSubtractTest {
    Adder adder = new Adder();
    Subtractor subtractor = new Subtractor();

    @Test
    public void add_and_subtract(){
        int sum = adder.add(2,2);
        int remainder = subtractor.subtract(sum,4);
        assertThat(remainder, is(0));
    }
}
