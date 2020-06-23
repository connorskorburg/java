package com.connorskorburg.showproject.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	public String singleSong(@PathVariable("id") Long id, Model model) {
		Song b = songService.findSong(id);
		model.addAttribute("song", b);
		return "WEB-INF/songs/NewSong.jsp";
	}
	@RequestMapping(value="/updateSong", method=RequestMethod.POST)
	public String update(@RequestParam(value="id") Long id, @RequestParam(value="title") String title, @RequestParam(value="artist") String artist, @RequestParam(value="year") Integer year) {
		songService.updateSong(id, title, artist, year);
		Song b = songService.findSong(id);
		songService.updateSong(b);
		return "redirect:/" + id;
	}
    @RequestMapping(value="/updateSong", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("song") Song song, BindingResult result) {
        if (result.hasErrors()) {
            return "WEB-INF/songs/NewSong.jsp";
        } else {
            songService.updateSong(song);
            return "redirect:/books";
        }
    }
	@RequestMapping("/AllSongs")
	public String allSongs(Model model) {
		List<Song> songs = songService.allSongs();
		model.addAttribute("songs", songs);
		return "WEB-INF/songs/AllSongs.jsp";
	}
	@RequestMapping(value="deleteSong", method=RequestMethod.POST)
	public String delete(@RequestParam(value="id") String id) {
		Long newid = Long.parseLong(id);
		System.out.println("Type: " + newid.getClass());
		songService.deleteSong(newid);
		return "redirect:/AllSongs";
	}
}

