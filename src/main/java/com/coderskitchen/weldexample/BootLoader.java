package com.coderskitchen.weldexample;

import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.util.List;

/**
 * Entry point of the application
 */
public class BootLoader {

	@Inject
	HelloWorldPrinter printer;

	/**
	 * Listens to ContainerInitialized event.
	 * This is send out by the weld bootstrap loader after successful start up
	 *
	 * @param event
	 */
	public void bootListener(@Observes ContainerInitialized event, @Parameters List<String> cmdLineArgs) {
		System.out.println("DSFFFFFSDFSDFSF");
		if (cmdLineArgs.isEmpty()) {
			printer.printHello();
		} else {
			printer.printHello(cmdLineArgs.get(0));
		}
	}
}
