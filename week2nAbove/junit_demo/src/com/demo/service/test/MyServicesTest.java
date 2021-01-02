package com.demo.service.test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.demo.service.MyServices;

public class MyServicesTest {

	public static MyServices services;
	
	@BeforeAll
	public static void setupMyServices() {
		services = new MyServices();
	}
	
	@Test
	public void testSayHelloByName() {
		String output= "Hello Vinay";
		assertEquals(output, services.sayHello("Vinay"));
	}
	
	@Test
	public void testSayHelloForNull() {
		assertNull(services.sayHello(null));
	}
	
}
