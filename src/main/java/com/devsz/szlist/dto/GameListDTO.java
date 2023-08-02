package com.devsz.szlist.dto;

import com.devsz.szlist.entities.GameList;

public class GameListDTO {
    
    private Long id;
    private String name;
    
    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        this.name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    
}
