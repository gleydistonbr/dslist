package com.gleydistonbr.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gleydistonbr.dslist.entities.Game;
import com.gleydistonbr.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
