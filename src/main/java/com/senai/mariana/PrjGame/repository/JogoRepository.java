package com.senai.mariana.PrjGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.mariana.PrjGame.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {

}