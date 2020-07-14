

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerProg {
	@RequestMapping("/")
	public String welcome() {
		return "welcome.jsp";
	}
}