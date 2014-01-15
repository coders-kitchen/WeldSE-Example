package com.coderskitchen.weldexample;

import javax.inject.Inject;

/**
 * Prints out a warm greeting
 */
public class HelloWorldPrinter {

	@Inject
	private UUIDGenerator uuidGenerator;

	/**
	 * Simply says hello to the world
	 */
	public void printHello() {
		printHello("world");
	}

	/**
	 * Simply says hello to a specific
	 * @param greetedIndividual
	 */
	public void printHello(String greetedIndividual) {

		System.err.println(String.format("Hello %s.\nThis is a greeting from a injected bean! (%s) %n", greetedIndividual, uuidGenerator.generatorUUID()));
	}
}
