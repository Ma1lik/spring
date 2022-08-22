package com.example.dbconnection.Dao;

import com.example.dbconnection.Entities.Etudiants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EtudiantRepository extends JpaRepository<Etudiants,Long> {
}
