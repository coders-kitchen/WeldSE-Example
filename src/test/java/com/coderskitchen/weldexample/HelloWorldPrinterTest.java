package com.coderskitchen.weldexample;

import org.jglue.cdiunit.CdiRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

@RunWith(CdiRunner.class)
public class HelloWorldPrinterTest {
	@Inject
	HelloWorldPrinter helloWorldPrinter;
	@Test
	public void testPrintHello() throws Exception {
		helloWorldPrinter.printHello();
	}

	@Test
	public void testPrintHello1() throws Exception {
		helloWorldPrinter.printHello("test");

	}
}
