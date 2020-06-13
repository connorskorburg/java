package com.connorskorburg.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("")
	public String index(HttpSession session) {
		Integer count = (Integer) session.getAttribute("count");
		if(count==null) {
			session.setAttribute("count", 1);			
		}
		if(count!=null) {
			count += 1;
			session.setAttribute("count", count);
		}
		System.out.println("count: " + count);
		return "/WEB-INF/index.jsp";
	}
	@RequestMapping("/counter")
	public String counter() {
		return "/WEB-INF/counter.jsp";
	}
}
