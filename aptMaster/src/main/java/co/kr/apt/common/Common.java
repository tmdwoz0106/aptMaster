package co.kr.apt.common;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Common {

	@RequestMapping(value = "common/main.do", method = RequestMethod.GET)
	public String main() throws Exception{
		
		return "common/main";
	}
	
	
	@RequestMapping(value = "common/loginPage.do", method = RequestMethod.GET)
	public String loginPage() {
		
		return "common/loginPage";
	}
	
	
	@RequestMapping(value = "user/Join.do", method = RequestMethod.GET)
	public String userJoin() throws Exception{
		
		
		return null;
	}
}
