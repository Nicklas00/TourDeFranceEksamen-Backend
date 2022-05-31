package com.example.tourdefranceeksamenbackend.Controller;

import com.example.tourdefranceeksamenbackend.Model.Cykelrytter;
import com.example.tourdefranceeksamenbackend.Service.CykelrytterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/cykelrytter")
public class CykelrytterRESTController {
  private final CykelrytterService cykelrytterService;

  @Autowired
  public CykelrytterRESTController(CykelrytterService cykelrytterService){
    this.cykelrytterService = cykelrytterService;
  }

  @PostMapping()
  public ResponseEntity<Cykelrytter> createCykelhold(@RequestBody Cykelrytter cykelrytter){
    return new ResponseEntity<>(cykelrytterService.save(cykelrytter), HttpStatus.CREATED);
  }

  @GetMapping()
  public ResponseEntity<List<Cykelrytter>> getAllCykelryttere(){
    return new ResponseEntity<>(cykelrytterService.findAll(),HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Cykelrytter> deleteCykelhold(@PathVariable Long id){
    cykelrytterService.deleteById(id);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @PutMapping()
  public ResponseEntity<Cykelrytter> updateCykelhold(@RequestBody Cykelrytter cykelrytter){
    return new ResponseEntity<>(cykelrytterService.save(cykelrytter), HttpStatus.OK);
  }

  @GetMapping("/cykelhold/{id}")
  public ResponseEntity<List<Cykelrytter>> getCykelrytterByCykelholdId(@PathVariable Long id){
    return new ResponseEntity<>(cykelrytterService.getCykelrytterByCykelholdId(id), HttpStatus.OK);
  }

  @GetMapping("/gultrøje")
  public ResponseEntity<List<Cykelrytter>> getCykelrytterByTotalTid(){
    return new ResponseEntity<>(cykelrytterService.getCykelrytterByTotalTid(), HttpStatus.OK);
  }

  @GetMapping("/prikkettrøje")
  public ResponseEntity<List<Cykelrytter>> getCykelrytterByBjergpoints(){
    return new ResponseEntity<>(cykelrytterService.getCykelrytterByBjergpoints(), HttpStatus.OK);
  }

  @GetMapping("/spurttrøje")
  public ResponseEntity<List<Cykelrytter>> getCykelrytterBySpurtpoints(){
    return new ResponseEntity<>(cykelrytterService.getCykelrytterBySpurtpoints(), HttpStatus.OK);
  }

  @GetMapping("/hvidtrøje")
  public ResponseEntity<List<Cykelrytter>> getCykelrytterByAlderOgHurtigesteTid(){
    return new ResponseEntity<>(cykelrytterService.getCykelrytterByAlderOgHurtigesteTid(), HttpStatus.OK);
  }

  @GetMapping("/sortereftertid")
  public ResponseEntity<List<Cykelrytter>> getCykelrytterOrderedByTotalTime(){
    return new ResponseEntity<>(cykelrytterService.getCykelrytterOrderedByTotalTime(), HttpStatus.OK);
  }



}
