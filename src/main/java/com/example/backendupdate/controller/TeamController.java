package com.example.backendupdate.controller;


import com.example.backendupdate.model.Rider;
import com.example.backendupdate.model.Team;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface TeamController {

    @GetMapping("/findTeamByFirstName/team/{searchTeamName}")
    //heter fra forend
    public List<Team> getTeamByTeamName(@PathVariable String searchTeamName);


    @GetMapping("/show/teams")
    public List<Team> getAllTeams();


    @PostMapping("/create/Team")
    public ResponseEntity<Rider> createRider(@RequestBody Rider rider);


    @GetMapping("/findTeamById/team/{searchById}")
    public List<Team> getTeamBySearchId(@PathVariable int searchById);


    @PutMapping("/update/team/{searchById}")
    public ResponseEntity<String> updateTeam(@PathVariable int searchById, @RequestBody Team team);

    @DeleteMapping("/delete/team/{id}")
    public ResponseEntity<String> deleteTeam(@PathVariable int id);


}
