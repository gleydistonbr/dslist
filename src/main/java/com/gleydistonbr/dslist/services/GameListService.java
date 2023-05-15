package com.gleydistonbr.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gleydistonbr.dslist.dto.GameDTO;
import com.gleydistonbr.dslist.dto.GameListDTO;
import com.gleydistonbr.dslist.dto.GameMinDTO;
import com.gleydistonbr.dslist.entities.Game;
import com.gleydistonbr.dslist.entities.GameList;
import com.gleydistonbr.dslist.repositories.GameListRepository;
import com.gleydistonbr.dslist.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	 
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
		
	}
}
