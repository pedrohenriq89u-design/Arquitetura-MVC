package com.senai.senaimusic.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Musica {

        @Id
        private int id;
        private String nome;
        private Genero genero;
        private int idArtista;
    }

