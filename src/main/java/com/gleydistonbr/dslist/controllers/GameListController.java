package com.gleydistonbr.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gleydistonbr.dslist.dto.GameDTO;
import com.gleydistonbr.dslist.dto.GameListDTO;
import com.gleydistonbr.dslist.dto.GameMinDTO;
import com.gleydistonbr.dslist.services.GameListService;
import com.gleydistonbr.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
}
