package com.emsi.eat.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.eat.models.Commande;


public interface CommandeRepository extends JpaRepository<Commande,Long> {

}
