package com.devsz.szlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsz.szlist.dto.GameListDTO;
import com.devsz.szlist.services.GameListServices;

@RestController
@RequestMapping(value ="/lists")
public class GameListController {

    @Autowired
    private GameListServices gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

}
