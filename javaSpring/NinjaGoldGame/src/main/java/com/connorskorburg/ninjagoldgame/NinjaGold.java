package com.connorskorburg.ninjagoldgame;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGold {
	@RequestMapping("/")
	public String gold(HttpSession session) {
		if(null == session.getAttribute("gold")) {
			session.setAttribute("gold", 0);
			ArrayList<String> goldDisplay = new ArrayList<String>();
			session.setAttribute("goldDisplay", goldDisplay);
		}
		return "/WEB-INF/gold.jsp";
	}
	@RequestMapping(value="/processActivities", method=RequestMethod.POST)
	public String processActivities(HttpSession session, @RequestParam(value="activity") String activity) {
		String pattern = "(MMMMM dd yyyy, hh:mm aa)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String date = sdf.format(new Date());
		if(activity.equals("farm")) {
			Random r = new Random();
			Integer newGold = r.nextInt(20 - 10) + 10;
			Integer gold = (Integer) session.getAttribute("gold");
			gold += newGold;
			session.setAttribute("gold", gold);
			ArrayList<String> goldDisplay = (ArrayList<String>) session.getAttribute("goldDisplay");  
			goldDisplay.add("You entered a farm and earned " + newGold + " gold. " + date);
			session.setAttribute("goldDisplay", goldDisplay);
			return "redirect:/";
		}
		if(activity.equals("cave")) {
			Random r = new Random();
			Integer newGold = r.nextInt(10 - 5) + 5;
			Integer gold = (Integer) session.getAttribute("gold");
			gold += newGold;
			session.setAttribute("gold", gold);
			ArrayList<String> goldDisplay = (ArrayList<String>) session.getAttribute("goldDisplay");  
			goldDisplay.add("You entered a cave and earned " + newGold + " gold. " + date);
			session.setAttribute("goldDisplay", goldDisplay);
			return "redirect:/";
		}
		if(activity.equals("house")) {
			Random r = new Random();
			Integer newGold = r.nextInt(5 - 2) + 2;
			Integer gold = (Integer) session.getAttribute("gold");
			gold += newGold;
			session.setAttribute("gold", gold);
			ArrayList<String> goldDisplay = (ArrayList<String>) session.getAttribute("goldDisplay");  
			goldDisplay.add("You entered a house and earned " + newGold + " gold. " + date);
			session.setAttribute("goldDisplay", goldDisplay);
			return "redirect:/";
		}
		if(activity.equals("casino")) {
			Random r = new Random();
			Integer newGold = r.nextInt(50  - (-50)) - 50;
			Integer gold = (Integer) session.getAttribute("gold");
			gold += newGold;
			session.setAttribute("gold", gold);
			ArrayList<String> goldDisplay = (ArrayList<String>) session.getAttribute("goldDisplay");
			if(newGold >= 0) {
				goldDisplay.add("You entered a casino and earned " + newGold + " gold. " + date);				
			}
			if(newGold < 0) {
				goldDisplay.add("You entered a casino and lost " + newGold + " gold. Ouch! " + date);
			}
			session.setAttribute("goldDisplay", goldDisplay);
			return "redirect:/";
		}
		return "redirect:/";
	}

}
