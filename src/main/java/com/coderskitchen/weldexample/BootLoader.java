package com.coderskitchen.weldexample;

import org.jboss.weld.environment.se.events.ContainerInitialized;

import javax.enterprise.event.Observes;

public class BootLoader {
	public void bootListener(@Observes ContainerInitialized event) {
		System.out.println("I started!");
	}
}
