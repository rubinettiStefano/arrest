package com.generation.esercizioarrest.controllers;

import com.generation.esercizioarrest.controllers.helpers.ControllerHelper;
import com.generation.esercizioarrest.model.entities.Inmate;
import com.generation.esercizioarrest.model.repositories.InmateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inmates")
public class InmateController
{
	@Autowired
	private ControllerHelper ch;

	/**
	 * Produce il JSON di tutti i detenuti
	 */
	@GetMapping
	public List<Inmate> getAll()
	{
		//TODO
		return null;
	}

	/**
	 * Inserisce nel db il detenuto il cui JSON arriva come BODY della Request HTTP
	 */
	@PostMapping
	public Inmate insertOne(@RequestBody Inmate inmate)
	{
		//TODO
		return null;
	}

	/**
	 * Produce il JSON di un singolo detenuto dato il suo ID
	 */
	@GetMapping("/{id}")
	public Inmate getOne(@PathVariable Long id)
	{
		//TODO
		return null;
	}

	/**
	 * Modifica nel db il detenuto il cui JSON arriva come BODY della Request HTTP
	 * e il cui id arriva come path variable
	 */
	@PutMapping("/{id}")
	public Inmate modifyOne(@PathVariable Long id,@RequestBody Inmate inmate)
	{
		inmate.setId(id);
		//TODO
		return null;
	}

	/**
	 * Elimina il detenuto con id che arriva come path variabile
	 */
	@DeleteMapping("/{id}")
	public Inmate deleteOne(@PathVariable Long id)
	{
		//TODO
		return null;
	}
}
