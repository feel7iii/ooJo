package com.atom.ooJo.common.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HiController {

	//private static final Logger logger = (Logger) LoggerFactory.getLogger(GreetingController.class);

	@RequestMapping("/")
	public String root() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginView() {
		return "login";
	}
	
	@RequestMapping(value = "/datetimepicker", method = RequestMethod.GET)
	public String datetimepicker() {
		return "common/datetimepicker";
	}
	
	@RequestMapping(value = "/ueditor", method = RequestMethod.GET)
	public String ueditor() {
		return "common/ueditor";
	}
	
	@RequestMapping(value = "/ooeditor", method = RequestMethod.GET)
	public String ooeditor() {
		return "common/ooeditor";
	}
	
	@RequestMapping(value = "/fileup", method = RequestMethod.GET)
	public String fileup() {
		return "fileup";
	}
	
	@RequestMapping(value = "/getree", method = RequestMethod.GET)
	public String getree() {
		return "common/tree";
	}
}