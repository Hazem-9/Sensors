package users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@GetMapping("/User-page")
	public void userpage() {
		
		System.out.println("Welcome to user page");
	}

}
