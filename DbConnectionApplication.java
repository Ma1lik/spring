package com.example.dbconnection;

  import com.example.dbconnection.Entities.Etudiants;
  import com.example.dbconnection.Services.EtudiantService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.boot.CommandLineRunner;
 import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

  import java.text.SimpleDateFormat;
 import java.util.Locale;


@SpringBootApplication

public class DbConnectionApplication implements CommandLineRunner {
    @Autowired
    private EtudiantService service;

    public static void main(String[] args) {
        SpringApplication.run(DbConnectionApplication.class, args);

    }

    SimpleDateFormat formatter = new SimpleDateFormat("dd/M/yyyy", Locale.ENGLISH);
    @Override
    public void run(String... args) throws Exception {
        service.save(new Etudiants(null,"ayoub ouabi","ayoubob69@gmail.com", formatter.parse("06/09/1999"), 250));
        service.save(new Etudiants(null,"mohamed ouabi","mohamed@gmail.com", formatter.parse("06/09/1996"),50));
        service.save(new Etudiants(null,"abdo ouabi","abdo@gmail.com", formatter.parse("06/09/1995"),10));
        service.save(new Etudiants(null,"brahim ouabi","brahim@gmail.com", formatter.parse("06/09/1994"),280));

    }

}
