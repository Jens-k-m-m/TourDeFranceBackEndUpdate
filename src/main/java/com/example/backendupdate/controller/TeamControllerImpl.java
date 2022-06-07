package com.example.backendupdate.controller;


import com.example.backendupdate.model.Rider;
import com.example.backendupdate.model.Team;
import com.example.backendupdate.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class TeamControllerImpl implements TeamController {
  @Autowired
  TeamRepository teamRepository;

  @Override
  public List<Team> getTeamByTeamName(String searchTeamName) {
    return null;
  }

  @Override
  public List<Team> getAllTeams() {
    return teamRepository.findAll();
  }

  @Override
  public ResponseEntity<Rider> createRider(Rider rider) {
    return null;
  }

  @Override
  public List<Team> getTeamBySearchId(int searchById) {
    return null;
  }

  @Override
  public ResponseEntity<String> updateTeam(int searchById, Team team) {
    return null;
  }

  @Override
  public ResponseEntity<String> deleteTeam(int id) {
    return null;
  }
}
