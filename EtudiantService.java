package com.example.dbconnection.Services;

import com.example.dbconnection.Dao.EtudiantRepository;
import com.example.dbconnection.Entities.Etudiants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

        @Autowired
        private EtudiantRepository etudiantRepository;

        public void save(Etudiants e){
            etudiantRepository.save(e);
        }
        public List<Etudiants> findAll(){

            return  etudiantRepository.findAll();
        }



}
