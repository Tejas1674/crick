package com.crick.aps.repositry;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.aps.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer> {
	//match fetch 
	Optional<Match> findByTeamHeading(String teamHeading);
}
