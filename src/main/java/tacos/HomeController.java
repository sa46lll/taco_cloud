package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //컨트롤러
public class HomeController {
	
	@GetMapping("/")  //루트경로인 /의 웹요청을 처리함.
	public String home() {
		return "home";  // 뷰 이름을 반환함.
	}

}
