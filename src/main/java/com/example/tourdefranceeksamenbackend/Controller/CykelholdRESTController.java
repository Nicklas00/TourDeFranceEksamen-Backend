package com.example.tourdefranceeksamenbackend.Controller;

import com.example.tourdefranceeksamenbackend.Model.Cykelhold;
import com.example.tourdefranceeksamenbackend.Service.CykelholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/cykelhold")
public class CykelholdRESTController {
  private final CykelholdService cykelholdService;

  @Autowired
  public CykelholdRESTController(CykelholdService cykelholdService){
    this.cykelholdService = cykelholdService;
  }

  @PostMapping()
  public ResponseEntity<Cykelhold> createCykelhold(@RequestBody Cykelhold cykelhold){
    return new ResponseEntity<>(cykelholdService.save(cykelhold), HttpStatus.CREATED);
  }

  @GetMapping()
  public ResponseEntity<List<Cykelhold>> getAllCykelhold(){
    return new ResponseEntity<>(cykelholdService.findAll(),HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Cykelhold> deleteCykelhold(@PathVariable Long id){
    cykelholdService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @PutMapping()
  public ResponseEntity<Cykelhold> updateCykelhold(@RequestBody Cykelhold cykelhold){
    return new ResponseEntity<>(cykelholdService.save(cykelhold), HttpStatus.OK);
  }


}
