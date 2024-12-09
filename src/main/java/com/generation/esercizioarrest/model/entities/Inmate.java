package com.generation.esercizioarrest.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Entity
public class Inmate extends Person
{
	private String crime;
	private int sentenceDuration;//in giorni
	private LocalDate internmentDate;//data di inizio carcerazione
	@Enumerated(EnumType.STRING)
	private SecurityLevel securityLevel;

	public LocalDate getReleaseDate()
	{
		//TODO deve dare il giorno di rilascio
		return null;
	}

	public boolean isInJail()
	{
		//TODO deve dare true se è ancora in prigione, se non è stato ancora rilasciato
		return false;
	}


	public String getCrime()
	{
		return crime;
	}

	public void setCrime(String crime)
	{
		this.crime = crime;
	}

	public int getSentenceDuration()
	{
		return sentenceDuration;
	}

	public void setSentenceDuration(int sentenceDuration)
	{
		this.sentenceDuration = sentenceDuration;
	}

	public LocalDate getInternmentDate()
	{
		return internmentDate;
	}

	public void setInternmentDate(LocalDate internmentDate)
	{
		this.internmentDate = internmentDate;
	}

	public SecurityLevel getSecurityLevel()
	{
		return securityLevel;
	}

	public void setSecurityLevel(SecurityLevel securityLevel)
	{
		this.securityLevel = securityLevel;
	}
}
