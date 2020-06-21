package com.connorskorburg.showproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.connorskorburg.showproject.services.SongService;

@Controller
public class ShowController {
	private final SongService songService;
	public ShowController(SongService songService) {
		this.songService = songService;
	}
	@RequestMapping("/songs")
	public String index() {
		return "WEB-INF/songs/Index.jsp";
	}
}
