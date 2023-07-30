package com.devsz.szlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devsz.szlist.dto.GameMinDTO;
import com.devsz.szlist.entities.Game;
import com.devsz.szlist.repositories.GameRepository;

@Component
public class GameServices {
    
    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
