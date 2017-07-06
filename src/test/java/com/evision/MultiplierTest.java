package com.evision;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by gabe.clark on 7/6/17.
 */
public class MultiplierTest {
    Multiplier multiplier = new Multiplier();

    @Test
    public void multiply_should_return_product_given_two_integers(){
        assertThat(multiplier.multiply(2,2), is(4));
    }

}