package com.devsz.szlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsz.szlist.dto.GameListDTO;
import com.devsz.szlist.dto.GameMinDTO;
import com.devsz.szlist.services.GameListServices;
import com.devsz.szlist.services.GameServices;

@RestController
@RequestMapping(value ="/lists")
public class GameListController {

    @Autowired
    private GameListServices gameListService;

    @Autowired
    private GameServices gameServices;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameServices.findByList(listId);
        return result;
    }

}
