package com.senai.senaimusic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicaController {

    @GetMapping("Música")
    public String tocarMusica(){
        return "Tocando Ah, como eu amei!!" ;
    }
}
