package com.example.tourdefranceeksamenbackend.Service;

import com.example.tourdefranceeksamenbackend.Model.Cykelrytter;
import com.example.tourdefranceeksamenbackend.Repository.CykelrytterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CykelrytterService {
  private final CykelrytterRepository cykelrytterRepository;

  @Autowired
  public CykelrytterService(CykelrytterRepository cykelrytterRepository){
    this.cykelrytterRepository = cykelrytterRepository;
  }

  public List<Cykelrytter> getCykelrytterByCykelholdId(Long id) {
    return cykelrytterRepository.getCykelrytterByCykelholdId(id);
  }

  public Cykelrytter save(Cykelrytter cykelrytter) {
    return cykelrytterRepository.save(cykelrytter);
  }

  public List<Cykelrytter> findAll() {
    return cykelrytterRepository.findAll();
  }

  public void deleteById(Long id) {
    cykelrytterRepository.deleteById(id);
  }

  public List<Cykelrytter> getCykelrytterByTotalTid() {
    return cykelrytterRepository.getCykelrytterByTotalTid();
  }

  public List<Cykelrytter> getCykelrytterByBjergpoints() {
    return cykelrytterRepository.getCykelrytterByBjergPoints();
  }

  public List<Cykelrytter> getCykelrytterBySpurtpoints() {
    return cykelrytterRepository.getCykelrytterBySpurtPoints();
  }

  public List<Cykelrytter> getCykelrytterByAlderOgHurtigesteTid() {
    return cykelrytterRepository.getCykelrytterByAlderOgHurtigesteTid();
  }

  public List<Cykelrytter> getCykelrytterOrderedByTotalTime() {
    return cykelrytterRepository.getCykelrytterOrderedByTotalTime();
  }
}
