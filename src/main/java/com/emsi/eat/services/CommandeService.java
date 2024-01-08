package com.emsi.eat.services;

import com.emsi.eat.models.Commande;

import java.util.List;

public interface CommandeService {
    List<Commande> getAllCommandes();

    Commande getCommandeById(Long id);

    Commande updateCommande(Commande commande);

    void deleteCommande(Long id);


	Commande createCommande(Commande commande);

}
