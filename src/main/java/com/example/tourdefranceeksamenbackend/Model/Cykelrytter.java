package com.example.tourdefranceeksamenbackend.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
public class Cykelrytter {
  @Id
  @Column(name = "cykelrytter_id", nullable = false)
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(cascade = CascadeType.MERGE)
  @JoinColumn(name = "cykelhold_id")
  private Cykelhold cykelhold;

  @Column(name = "cykelrytter_navn")
  private String cykelrytterNavn;

  @Column(name = "cykelrytter_alder")
  private int cykelrytterAlder;

  @Column(name = "cykelrytter_nationalitet")
  private String cykelrytterNationalitet;

  @Column(name = "cykelrytter_samlettid")
  private int samletTidIMin;

  @Column(name = "cykelrytter_bjergpoint")
  private int bjergPoints;

  @Column(name = "cykelrytter_spurtpoint")
  private int spurtPoints;
}

