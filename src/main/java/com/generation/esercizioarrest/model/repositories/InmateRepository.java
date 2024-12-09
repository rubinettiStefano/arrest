package com.generation.esercizioarrest.model.repositories;

import com.generation.esercizioarrest.model.entities.Inmate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmateRepository extends JpaRepository<Inmate, Long>
{
}
