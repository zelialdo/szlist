package com.devsz.szlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsz.szlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    

}
