package com.devsz.szlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsz.szlist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    

}
