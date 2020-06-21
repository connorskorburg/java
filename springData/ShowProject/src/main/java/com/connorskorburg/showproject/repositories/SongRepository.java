package com.connorskorburg.showproject.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.connorskorburg.showproject.models.Song;

@Repository
public interface SongRepository extends CrudRepository<Song, Long>{
    //this method retrieves all the songs from the database
	List<Song> findAll();
	// this method deletes a book that starts with a specific title
    void deleteById(Long id);
}
