package com.example.backendupdate.repository;

import com.example.backendupdate.model.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiderRepository extends JpaRepository<Rider, Integer> {


  List<Rider> findRiderByRiderFirstNameContaining(String riderFirstName);

  List<Rider> findRiderByRiderId(int riderId );

  List<Rider> findTop4ByOrderByRiderAge();

  List<Rider> findTop4ByOrderByRiderTime();

  List<Rider> findRiderByTeamTeamId(int teamId);

  List<Rider> findByOrderByRiderTimeAsc();
}
