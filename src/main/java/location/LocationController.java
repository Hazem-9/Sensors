package location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
	
	@Autowired
	private LocationRepo LocationRepo;
	
	@GetMapping("/GetAllLocations")
	public Iterable <LocationEntity> getall() {
		
		
		
		return LocationRepo.findAll();
		
		
	}

}
