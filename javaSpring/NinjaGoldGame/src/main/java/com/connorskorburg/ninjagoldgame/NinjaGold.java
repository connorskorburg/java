package com.connorskorburg.ninjagoldgame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaGold {
	@RequestMapping("/")
	public String gold() {
		return "/WEB-INF/gold.jsp";
	}
	@RequestMapping("/addFarm")
	public String addFarm() {
		
		return "redirect:/";
	}
}
