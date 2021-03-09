package com.codecool.springbootproject.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
@ToString
public class Song {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private java.sql.Date date;
  private double duration;


  public Song(String name, Date date, double duration) {
    this.name = name;
    this.date = date;
    this.duration = duration;
  }

  public Song(){

  }


}
