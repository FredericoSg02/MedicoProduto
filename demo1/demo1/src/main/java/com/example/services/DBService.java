package com.example.services;


import com.example.domains.Medico;
import com.example.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class DBService {

    @Autowired
    private MedicoRepository medicoRepo;

    public void initDB(){

        Medico medico01 = new Medico(0,"Pedro", LocalDate.now(), new BigDecimal("20000.00"));
        Medico medico02 = new Medico(0, "João", LocalDate.now(), new BigDecimal("15000.00"));
        Medico medico03 = new Medico(0, "Maressa", LocalDate.now(), new BigDecimal("2500.00"));
        Medico medico04 = new Medico(0, "Lucas", LocalDate.now(), new BigDecimal("1400.00"));

        medicoRepo.save(medico01);
        medicoRepo.save(medico02);
        medicoRepo.save(medico03);
        medicoRepo.save(medico04);

    }
}
