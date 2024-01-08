package com.emsi.eat.services;

import java.util.List;
import java.util.Optional;

import com.emsi.eat.models.Snack;

public interface SnackService {

	Snack save(Snack snack);

	List<Snack> getAllSnacks();


	void deleteSnackById(Long id);

	Optional<Snack> getSnackById(Long id);




	
 
}
