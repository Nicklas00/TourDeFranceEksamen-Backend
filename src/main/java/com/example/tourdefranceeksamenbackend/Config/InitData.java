package com.example.tourdefranceeksamenbackend.Config;

import com.example.tourdefranceeksamenbackend.Model.Cykelhold;
import com.example.tourdefranceeksamenbackend.Model.Cykelrytter;
import com.example.tourdefranceeksamenbackend.Service.CykelholdService;
import com.example.tourdefranceeksamenbackend.Service.CykelrytterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitData implements CommandLineRunner {
  @Autowired
  CykelholdService cykelholdService;
  @Autowired
  CykelrytterService cykelrytterService;

  @Override
  public void run(String... Args)throws Exception {
    Cykelhold cykelhold1 = new Cykelhold();
    cykelhold1.setCykelholdNavn("Team DSM");
    cykelholdService.save(cykelhold1);

    Cykelhold cykelhold2 = new Cykelhold();
    cykelhold2.setCykelholdNavn("Lotto Soudal");
    cykelholdService.save(cykelhold2);

    Cykelhold cykelhold3 = new Cykelhold();
    cykelhold3.setCykelholdNavn("Cofidis");
    cykelholdService.save(cykelhold3);

    Cykelhold cykelhold4 = new Cykelhold();
    cykelhold4.setCykelholdNavn("Movistar Team");
    cykelholdService.save(cykelhold4);



    Cykelrytter cykelrytter1 = new Cykelrytter();
    cykelrytter1.setCykelrytterNavn("Cees Bol");
    cykelrytter1.setCykelrytterAlder(26);
    cykelrytter1.setCykelrytterNationalitet("Holland");
    cykelrytter1.setCykelhold(cykelhold1);
    cykelrytter1.setSamletTidIMin(500);
    cykelrytter1.setBjergPoints(23);
    cykelrytter1.setSpurtPoints(27);
    cykelrytterService.save(cykelrytter1);

    Cykelrytter cykelrytter2 = new Cykelrytter();
    cykelrytter2.setCykelrytterNavn("John Degenkolb");
    cykelrytter2.setCykelrytterAlder(33);
    cykelrytter2.setCykelrytterNationalitet("Tyskland");
    cykelrytter2.setCykelhold(cykelhold1);
    cykelrytter2.setSamletTidIMin(501);
    cykelrytter2.setBjergPoints(20);
    cykelrytter2.setSpurtPoints(21);
    cykelrytterService.save(cykelrytter2);

    Cykelrytter cykelrytter3 = new Cykelrytter();
    cykelrytter3.setCykelrytterNavn("Nils Eekhoff");
    cykelrytter3.setCykelrytterAlder(24);
    cykelrytter3.setCykelrytterNationalitet("Holland");
    cykelrytter3.setCykelhold(cykelhold1);
    cykelrytter3.setSamletTidIMin(502);
    cykelrytter3.setBjergPoints(21);
    cykelrytter3.setSpurtPoints(22);
    cykelrytterService.save(cykelrytter3);

    Cykelrytter cykelrytter4 = new Cykelrytter();
    cykelrytter4.setCykelrytterNavn("Romain Bardet");
    cykelrytter4.setCykelrytterAlder(31);
    cykelrytter4.setCykelrytterNationalitet("Frankrig");
    cykelrytter4.setCykelhold(cykelhold1);
    cykelrytter4.setSamletTidIMin(503);
    cykelrytter4.setBjergPoints(22);
    cykelrytter4.setSpurtPoints(23);
    cykelrytterService.save(cykelrytter4);

    Cykelrytter cykelrytter5 = new Cykelrytter();
    cykelrytter5.setCykelrytterNavn("Søren Kragh Andersen");
    cykelrytter5.setCykelrytterAlder(27);
    cykelrytter5.setCykelrytterNationalitet("Danmark");
    cykelrytter5.setCykelhold(cykelhold1);
    cykelrytter5.setSamletTidIMin(504);
    cykelrytter5.setBjergPoints(22);
    cykelrytter5.setSpurtPoints(23);
    cykelrytterService.save(cykelrytter5);

    Cykelrytter cykelrytter6 = new Cykelrytter();
    cykelrytter6.setCykelrytterNavn("Brent Van Moer");
    cykelrytter6.setCykelrytterAlder(24);
    cykelrytter6.setCykelrytterNationalitet("Belgien");
    cykelrytter6.setCykelhold(cykelhold2);
    cykelrytter6.setSamletTidIMin(505);
    cykelrytter6.setBjergPoints(23);
    cykelrytter6.setSpurtPoints(24);
    cykelrytterService.save(cykelrytter6);

    Cykelrytter cykelrytter7 = new Cykelrytter();
    cykelrytter7.setCykelrytterNavn("Tim Wellens");
    cykelrytter7.setCykelrytterAlder(31);
    cykelrytter7.setCykelrytterNationalitet("Belgien");
    cykelrytter7.setCykelhold(cykelhold2);
    cykelrytter7.setSamletTidIMin(509);
    cykelrytter7.setBjergPoints(22);
    cykelrytter7.setSpurtPoints(23);
    cykelrytterService.save(cykelrytter7);

    Cykelrytter cykelrytter8 = new Cykelrytter();
    cykelrytter8.setCykelrytterNavn("Philippe Gilbert");
    cykelrytter8.setCykelrytterAlder(39);
    cykelrytter8.setCykelrytterNationalitet("Belgien");
    cykelrytter8.setCykelhold(cykelhold2);
    cykelrytter8.setSamletTidIMin(510);
    cykelrytter8.setBjergPoints(21);
    cykelrytter8.setSpurtPoints(32);
    cykelrytterService.save(cykelrytter8);

    Cykelrytter cykelrytter9 = new Cykelrytter();
    cykelrytter9.setCykelrytterNavn("Caleb Ewan");
    cykelrytter9.setCykelrytterAlder(27);
    cykelrytter9.setCykelrytterNationalitet("Australien");
    cykelrytter9.setCykelhold(cykelhold2);
    cykelrytter9.setSamletTidIMin(520);
    cykelrytter9.setBjergPoints(35);
    cykelrytter9.setSpurtPoints(22);
    cykelrytterService.save(cykelrytter9);




  }
}
