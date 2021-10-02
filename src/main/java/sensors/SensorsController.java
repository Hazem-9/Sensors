package sensors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SensorsController {
	@Autowired
	private SensorRepo SensorRepo;
	
	
	@GetMapping("/Sensors")
	public Iterable<SensorsTypes> types () {
		System.out.println("our sensors is "+"1- Humidity sensor"+"2- Light sensor" + "3- Temperature sensor");
		
		return SensorRepo.findAll();
	}
	
	

}
