package com.connorskorburg.showproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.connorskorburg.showproject.models.Song;
import com.connorskorburg.showproject.repositories.SongRepository;


@Service
public class SongService {
	private final SongRepository songRepository;
	
	public SongService(SongRepository songRepository) {
		 this.songRepository = songRepository;
	}
	//returns all of the songs
	public List<Song> allSongs(){
		return songRepository.findAll();
	}
	//creates a song
	public Song createSong(Song b) {
		return songRepository.save(b);
	}
	//retrieves a song
	public Song findSong(Long id) {
		Optional<Song> optionalSong = songRepository.findById(id);
		if(optionalSong.isPresent()) {
			return optionalSong.get();
		} else {
			return null;
		}
	}
	public Song updateBook(Song b) {
		return songRepository.save(b);
	}
	//updates a song
	public Song updateSong(Long id, String title, String artist, Integer year) {
		Optional<Song> optionalSong = songRepository.findById(id);
		if(optionalSong.isPresent()) {
			optionalSong.get().setTitle(title);
			optionalSong.get().setArtist(artist);
			optionalSong.get().setYear(year);
			return optionalSong.get();
		} else {
			return null;
		}
	}
	//deletes a song
	public void deleteSong(Long id) {
		songRepository.deleteById(id);
	}
}
