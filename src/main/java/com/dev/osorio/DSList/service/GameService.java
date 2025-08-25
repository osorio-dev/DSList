package com.dev.osorio.DSList.service;

import com.dev.osorio.DSList.dto.GameDTO;
import com.dev.osorio.DSList.dto.GameMinDTO;
import com.dev.osorio.DSList.entities.Game;
import com.dev.osorio.DSList.projection.GameMinProjection;
import com.dev.osorio.DSList.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Optional<Game> gameOptional = gameRepository.findById(id);

        if (gameOptional.isEmpty()) {
            throw new RuntimeException("ID não encontrado!!");
        }

        return new GameDTO(gameOptional.get());
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAllGames() {
        List<Game> gameList = gameRepository.findAll();

        return gameList.stream()
                .map(GameMinDTO::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> gameList = gameRepository.searchByList(listId);

        return gameList.stream()
                .map(GameMinDTO::new)
                .toList();
    }
}
