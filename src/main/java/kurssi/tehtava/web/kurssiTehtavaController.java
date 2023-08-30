package kurssi.tehtava.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class kurssiTehtavaController {

	@RequestMapping("index")
	@ResponseBody
	public String tehtavaIndex() {
		return "This is the mainpage";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String tehtavaContact() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String tehtavaHello(@RequestParam(name="nimi", required = false, defaultValue = "Lauri") String nimi, @RequestParam(name="paikka", required = false, defaultValue = "school") String paikka) {
		return "Welcome to the " + paikka + " " + nimi; 
	}
}
