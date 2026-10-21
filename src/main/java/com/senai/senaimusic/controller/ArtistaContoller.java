package com.senai.senaimusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ArtistaContoller {

   @GetMapping("Artista")
    public String mostrarartista(){
        return "Benito Di Paula" ;
    }

}
