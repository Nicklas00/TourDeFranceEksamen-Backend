package com.example.tourdefranceeksamenbackend.Repository;

import com.example.tourdefranceeksamenbackend.Model.Cykelhold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CykelholdRepository extends JpaRepository<Cykelhold, Long> {

}
