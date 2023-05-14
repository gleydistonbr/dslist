package com.gleydistonbr.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gleydistonbr.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
