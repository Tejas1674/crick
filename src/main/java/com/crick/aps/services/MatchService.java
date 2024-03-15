package com.crick.aps.services;

import java.util.List;
import java.util.Map;

import com.crick.aps.entities.Match;


public interface MatchService {
	//get all matches
	List<Match> getAllMatches();
	
	//get live matches
	List<Match> getLiveMatches();
	
	//get cwc2023 point table
	List<List<String>> getPointTable();
}
