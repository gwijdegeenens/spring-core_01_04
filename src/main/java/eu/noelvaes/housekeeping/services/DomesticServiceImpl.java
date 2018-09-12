package eu.noelvaes.housekeeping.services;

public class DomesticServiceImpl implements DomesticService {
	private CleaningService cleaningService;
	private GardeningService gardeningService;
	
	public void setCleaningService(CleaningService cleaningService) {
		this.cleaningService = cleaningService;
	}
	public void setGardeningService(GardeningService gardeningService) {
		this.gardeningService = gardeningService;
	}
	
	public void runHousehold() {
		System.out.println("Running household");
		cleaningService.clean();
		gardeningService.garden();
	}
	
}
