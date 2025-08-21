package com.dev.osorio.DSList.service;

import com.dev.osorio.DSList.dto.GameMinDTO;
import com.dev.osorio.DSList.entities.Game;
import com.dev.osorio.DSList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAllGames() {
        List<Game> gameList = gameRepository.findAll();

        return gameList.stream()
                .map(GameMinDTO::new)
                .toList();
    }
}
