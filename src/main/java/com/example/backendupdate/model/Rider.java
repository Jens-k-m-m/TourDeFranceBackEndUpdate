package com.example.backendupdate.model;

import javax.persistence.*;

@Entity
public class Rider {


  @Id
  @Column(name = "rider_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int riderId;

  @Column(nullable = false)
  private String riderFirstName;

  @Column(nullable = false)
  private String riderLastName;

  @Column(nullable = false)
  private int riderAge;

  @Column(nullable = false)
  private int riderTime;

  @Column(nullable = false)
  private int riderPoint;

  @Column(nullable = false)
  private int riderMountainPoints;

  @Column(nullable = false)
  private String riderCountry;

  @ManyToOne(optional = false)
  @JoinColumn(name = "team_id")
  private Team team;

  public int getRiderId() {
    return riderId;
  }

  public void setRiderId(int riderId) {
    this.riderId = riderId;
  }

  public String getRiderFirstName() {
    return riderFirstName;
  }

  public void setRiderFirstName(String riderFirstName) {
    this.riderFirstName = riderFirstName;
  }

  public String getRiderLastName() {
    return riderLastName;
  }

  public void setRiderLastName(String riderLastName) {
    this.riderLastName = riderLastName;
  }

  public int getRiderAge() {
    return riderAge;
  }

  public void setRiderAge(int riderAge) {
    this.riderAge = riderAge;
  }

  public int getRiderTime() {
    return riderTime;
  }

  public void setRiderTime(int riderTime) {
    this.riderTime = riderTime;
  }

  public int getRiderPoint() {
    return riderPoint;
  }

  public void setRiderPoint(int riderPoint) {
    this.riderPoint = riderPoint;
  }

  public int getRiderMountainPoints() {
    return riderMountainPoints;
  }

  public void setRiderMountainPoints(int riderMountainPoints) {
    this.riderMountainPoints = riderMountainPoints;
  }

  public String getRiderCountry() {
    return riderCountry;
  }

  public void setRiderCountry(String riderCountry) {
    this.riderCountry = riderCountry;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  @Override
  public String toString() {
    return "Rider{" +
        "riderId=" + riderId +
        ", riderFirstName='" + riderFirstName + '\'' +
        ", riderLastName='" + riderLastName + '\'' +
        ", riderAge='" + riderAge + '\'' +
        ", riderTime='" + riderTime + '\'' +
        ", riderPoint='" + riderPoint + '\'' +
        ", riderMountainPoints='" + riderMountainPoints + '\'' +
        ", riderCountry='" + riderCountry + '\'' +
        ", team=" + team +
        '}';
  }
}
