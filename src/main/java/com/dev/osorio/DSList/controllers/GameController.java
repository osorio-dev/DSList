package com.dev.osorio.DSList.controllers;

import com.dev.osorio.DSList.dto.GameDTO;
import com.dev.osorio.DSList.dto.GameMinDTO;
import com.dev.osorio.DSList.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAllGames() {
        return gameService.findAllGames();
    }

    @GetMapping("/{id}")
    public GameDTO findById(@PathVariable Long id) {
        return gameService.findById(id);
    }
}
