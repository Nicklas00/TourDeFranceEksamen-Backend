package com.example.tourdefranceeksamenbackend.Service;

import com.example.tourdefranceeksamenbackend.Model.Cykelhold;
import com.example.tourdefranceeksamenbackend.Repository.CykelholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CykelholdService {
  private final CykelholdRepository cykelholdRepository;

  @Autowired
  public CykelholdService(CykelholdRepository cykelholdRepository){
    this.cykelholdRepository = cykelholdRepository;
  }

  public Cykelhold save(Cykelhold cykelhold) {
    return cykelholdRepository.save(cykelhold);
  }

  public List<Cykelhold> findAll() {
    return cykelholdRepository.findAll();
  }

  public void deleteById(Long id) {
    cykelholdRepository.deleteById(id);
  }
}
