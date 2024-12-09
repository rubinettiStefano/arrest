package com.generation.esercizioarrest.controllers.helpers;

import com.generation.esercizioarrest.model.repositories.InmateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//TODO
@Service
public class ControllerHelperImpl implements ControllerHelper
{
	@Autowired
	private InmateRepository iRepo;


}
