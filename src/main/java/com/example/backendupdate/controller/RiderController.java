package com.example.backendupdate.controller;

import com.example.backendupdate.model.Rider;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Interface class for riders  CRUD, for riders
 */
public interface RiderController {

  /**
   * Get a list of Riders from the database. The mapping is /byFirstName/riders/{searchFirstName}
   *
   * @param searchFirstName
   * @return A list of rider have the same  FirstName
   * @author Jens
   */
  @GetMapping("/byFirstName/riders/{searchFirstName}")
  //heter fra forend
  public List<Rider> getRiderByFirstName(@PathVariable String searchFirstName);

  /**
   * Get a list of Riders from the database. The mapping is /show/players
   *
   * @return A list of players
   * @author Jens
   */
  @GetMapping("/show/riders")
  public List<Rider> getAllRiders();


  /**
   * Create a rider in the database. When done it returns a HTTP response 200 (OK) Mapping is
   * /create/rider
   *
   * @param rider - given player to create.
   * @return A HTTP response
   * @author Jens
   */
  @PostMapping("/create/riders")
  public ResponseEntity<Rider> createRider(@RequestBody Rider rider);


  /**
   * Get a list of Riders from the database. The mapping is /findRiderById/rider/{searchById}
   *
   * @param searchById
   * @return int rider id;
   * @author Jens
   */
  @GetMapping("/findRiderById/rider/{searchById}")
  public List<Rider> getRiderBySearchId(@PathVariable int searchById);

  /**
   * Update a player. by id
   *
   * @param searchById - Rider id
   * @param rider      - updated rider in JSON
   * @return A HTTP response
   * @author Jens
   */
  @PutMapping("/update/rider/{searchById}")
  public ResponseEntity<String> updateRider(@PathVariable int searchById, @RequestBody Rider rider);

  /**
   * Delete an rider found by id, delete from database
   *
   * @param id - rider id
   * @return A HTTP response
   * @author Jens
   */
  @DeleteMapping("/delete/rider/{id}")
  public ResponseEntity<String> deleteRider(@PathVariable int id);

  /**
   * Get a list of rider from the Team id form database.  The mapping is /team/rider/{id}
   *
   * @return int id form Team
   * @author Jens
   */
  @GetMapping("/team/rider/{teamId}")
  public List<Rider> getRiderFromTeam(@PathVariable int teamId);

  @GetMapping("/top4Age/riders")
  public List<Rider> getRiderTop4Age();

  @GetMapping("/top4Time/riders")
  public List<Rider> getRiderTop4Times();

  @GetMapping("/team/riders/{teamId}")
  public List<Rider> getRiderFromGivenTeams(@PathVariable int teamId);


  @GetMapping("/sortByTimes/riders")
  public List<Rider> getRiderByTimeAndAgeFromTeams();

}
