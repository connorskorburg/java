package com.connorskorburg.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String index() {
		return "/WEB-INF/index.jsp";
	}
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String code(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		if(code.equals("Bushido")) {
			System.out.println("success");
			return "/WEB-INF/code.jsp";			
		}
		else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";			
		}
	}
	@RequestMapping(value="/code", method=RequestMethod.GET)
	public String code(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train harder!");
		return "redirect:/";
	}
}
