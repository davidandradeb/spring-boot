package com.dyalogo.example.example;

import com.dyalogo.example.example.bdr.DyUsuarios;
import com.dyalogo.example.example.repos.DyUsariosRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Component
public class TareasAutomaticas {
    private static final Logger logger = LoggerFactory.getLogger(TareasAutomaticas.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Autowired
    DyUsariosRepository usersRepo;

    @Scheduled(fixedDelay = 5000)
    public void scheduleTaskWithFixedDelay() {
        System.out.println("Hello Schedule " + dateTimeFormatter.format(LocalDateTime.now()));
        logger.info("Hi here is " + dateTimeFormatter.format(LocalDateTime.now()));

        List<DyUsuarios> lstUsuarios = usersRepo.findAll();

        for (DyUsuarios itemUsuario : lstUsuarios) {
            logger.info("Usuario -> " + itemUsuario.getId() + " nom:" + itemUsuario.getEmail());
            logger.trace("Mensaje TRAZA");
        }
    }
}
