package com.coderskitchen.weldexample;

/**
 * Prints out a warm greeting
 */
public class HelloWorldPrinter {
	/**
	 * Simply says hello
	 */
	public void printHello() {
		printHello("world");
	}

	public void printHello(String s) {
		System.out.printf("Hello %s.\nThis is a greeting from a injected bean!%n", s);
	}
}
