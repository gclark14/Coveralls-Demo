package com.evision;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoverallsdemoApplicationTests {

	CoverallsdemoApplication app = new CoverallsdemoApplication();

	@Test
	public void contextLoads() {
	    app.main(new String[0]);
	}

}
