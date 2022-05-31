package com.example.tourdefranceeksamenbackend.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Cykelhold {

  @Id
  @Column(name = "cykelhold_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @JsonBackReference(value = "cykelryttere")
  @OneToMany(mappedBy = "cykelhold", cascade = CascadeType.MERGE)
  @ToString.Exclude
  private List<Cykelrytter> cykelryttere;

  @Column(name = "cykelhold_navn")
  private String cykelholdNavn;


}
