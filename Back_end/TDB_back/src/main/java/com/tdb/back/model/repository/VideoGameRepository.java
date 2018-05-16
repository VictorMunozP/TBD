package com.tdb.back.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.tdb.back.model.entities.VideoGame;



public interface VideoGameRepository extends CrudRepository<VideoGame,Long> {

}
