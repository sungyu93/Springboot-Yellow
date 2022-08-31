package site.metacoding.yellow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class YellowController {
	
	@GetMapping("/yellow")
	public String yellow() {
		return "index";
	}

}
