package com.evision;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertThat;
import static sun.nio.cs.Surrogate.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoverallsdemoApplicationTests {

	@Test
	public void contextLoads(){
	    CoverallsdemoApplication.main(new String[0]);
	}

}
