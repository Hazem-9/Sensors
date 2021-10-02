package email;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	private EmailRepo EmailRepo;
	
	@GetMapping("/Email-Details")
	 Iterable <EmailEntity> getall(){
		
		
		return EmailRepo.findAll();
	}
	

}
