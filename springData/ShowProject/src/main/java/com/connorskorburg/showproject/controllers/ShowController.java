package com.connorskorburg.showproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.connorskorburg.showproject.models.Song;
import com.connorskorburg.showproject.services.SongService;

@Controller
public class ShowController {
	private final SongService songService;
	public ShowController(SongService songService) {
		this.songService = songService;
	}
	@RequestMapping("/")
	public String index() {
		return "WEB-INF/songs/Index.jsp";
	}
	@RequestMapping(value="/createSong", method=RequestMethod.POST)
	public String createSong(@RequestParam(value="title") String title, @RequestParam(value="artist") String artist, @RequestParam(value="year") Integer year) {
		Song b = new Song(title, artist, year);
		songService.createSong(b);
		return "redirect:/" + b.getId();
	}
	@RequestMapping("/{id}")
	public String singleSong(@PathVariable("id") Long id) {
		Song b = songService.findSong(id);
		String newTitle = b.getTitle();
		String newArtist= b.getArtist();
		Integer newYear = b.getYear();
		return "WEB-INF/songs/NewSong.jsp";
	}
}
