package com.evision;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by gabe.clark on 7/6/17.
 */
public class AdderTest {
    private static Adder adder = new Adder();

    @Test
    public void add_should_return_sum_given_two_integers(){
        assertThat(adder.add(2,2), is(4));
    }

    @Test
    public void add_should_return_sum_given_two_doubles(){
        assertThat(adder.add(2.0,2.0), is(4.0));
    }

}