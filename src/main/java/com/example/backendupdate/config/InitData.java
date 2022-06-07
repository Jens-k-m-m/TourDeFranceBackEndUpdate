package com.example.backendupdate.config;

import com.example.backendupdate.model.Rider;
import com.example.backendupdate.model.Team;
import com.example.backendupdate.repository.RiderRepository;
import com.example.backendupdate.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {

  @Autowired
  RiderRepository riderRepository;

  @Autowired
  TeamRepository teamRepository;

  @Override
  public void run(String... args) throws Exception {

    Team cofidis = new Team();
    cofidis.setTeamId(1);
    cofidis.setTeamName("Cofidis");
    cofidis.setTeamCountry("France");
    teamRepository.save(cofidis);


    Team adidas = new Team();
    adidas.setTeamId(2);
    adidas.setTeamName("Rykeby");
    adidas.setTeamCountry("Danmark");
    teamRepository.save(adidas);


    //Arrange
    Rider rider = new Rider();
    rider.setRiderFirstName("Simon");
    rider.setRiderLastName("Geschke");
    rider.setRiderAge(36);
    rider.setRiderTime(480);
    rider.setRiderPoint(160);
    rider.setRiderMountainPoints(30);
    rider.setRiderCountry("Germany");
    // "team": {
    Team team = new Team();
    team.setTeamId(1);
    rider.setTeam(team);
    riderRepository.save(rider);

  }
}
