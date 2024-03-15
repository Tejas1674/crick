package com.crick.aps.contoller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.aps.entities.Match;
import com.crick.aps.services.*;

@RestController
@RequestMapping("/match")
public class MatchController {
    private  MatchService matchService; // Use MatchService instead of MatchController
    
    // Inject MatchService through constructor
    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches() {
        List<Match> matches = matchService.getLiveMatches(); // Use matchService here
        return new ResponseEntity<>(matches, HttpStatus.OK);
    }
    
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
    	return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }
    
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
    	return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }
}
