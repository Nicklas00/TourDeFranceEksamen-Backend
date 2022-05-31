package com.example.tourdefranceeksamenbackend.Repository;

import com.example.tourdefranceeksamenbackend.Model.Cykelrytter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CykelrytterRepository extends JpaRepository<Cykelrytter, Long> {

  //Hent alle cykelryttere fra et bestemt hold ved hjælp af JPA
  //List<Cykelrytter> getCykelrytterByCykelholdId(Long cykelholdId);

  //Hent alle cykelryttere fra et hold ved hjælp af en query
  @Query("SELECT c FROM Cykelrytter c WHERE c.cykelhold.id = ?1")
  List<Cykelrytter> getCykelrytterByCykelholdId(Long cykelholdId);

  @Query("SELECT c FROM Cykelrytter c WHERE c.samletTidIMin = (SELECT MIN(c.samletTidIMin) FROM Cykelrytter c)")
  List<Cykelrytter> getCykelrytterByTotalTid();

  @Query("SELECT c FROM Cykelrytter c WHERE c.bjergPoints = (SELECT MAX(c.bjergPoints) FROM Cykelrytter c)")
  List<Cykelrytter> getCykelrytterByBjergPoints();

  @Query("SELECT c FROM Cykelrytter c WHERE c.spurtPoints = (SELECT MAX(c.spurtPoints) FROM Cykelrytter c)")
  List<Cykelrytter> getCykelrytterBySpurtPoints();

  @Query("SELECT c FROM Cykelrytter c WHERE c.cykelrytterAlder <= 26 ORDER BY c.samletTidIMin asc")
  List<Cykelrytter> getCykelrytterByAlderOgHurtigesteTid();

  @Query("SELECT c FROM Cykelrytter c ORDER BY c.samletTidIMin asc")
  List<Cykelrytter> getCykelrytterOrderedByTotalTime();
}
