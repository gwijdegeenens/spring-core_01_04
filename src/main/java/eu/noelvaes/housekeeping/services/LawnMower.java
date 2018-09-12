package eu.noelvaes.housekeeping.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class LawnMower implements GardeningTool {
	public void doGardenJob() {
		System.out.println("Mowing the lawn");
	}
}
