package com.emsi.eat.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.emsi.eat.models.Snack;


public interface SnackRepository extends JpaRepository<Snack,Long> {

}
