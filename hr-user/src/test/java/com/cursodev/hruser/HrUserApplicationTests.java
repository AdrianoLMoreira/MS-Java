package com.cursodev.hruser;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


class HrUserApplicationTests {
	@Autowired
	BCryptPasswordEncoder passEncoder;

	@Test
	void contextLoads() {
		BCryptPasswordEncoder bcr = new BCryptPasswordEncoder();
		System.out.println("BCRYPT = " +bcr.encode("Coringa"));
	}

}
