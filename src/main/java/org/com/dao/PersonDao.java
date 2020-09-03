/*
 *--------------------------------------------------------
 * Administrateur
 *--------------------------------------------------------
 * Project     : spring-boot-postgres
 *
 * Copyright Administrateur,  All Rights Reserved.
 *
 *-------------------------------------------------------- 
 * 
 * Fichier 		:	PersonDao.java
 * Créé le 		: 	3 sept. 2020 à 10:48:10
 * Auteur		: 	ryan
 * 
 * Description 	:
 * 
 *---------------------------------------------------------
 */
package org.com.dao;

import java.util.List;

import org.com.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * A Renseigner.
 * @author  : ryan
 * @project : spring-boot-postgres
 * @package : org.com.dao
 * @date    : 3 sept. 2020 10:48:10
 */
@Repository
public interface PersonDao extends JpaRepository<Person, Integer>
{
   @Query("select p from person p where p.email :=email")
   public Person getByEmail(@RequestParam(value = "email" ) String email);
   
   @Query("select p from person p where p.firstname :=firstname")
   public List<Person> getByFirstname(@RequestParam(value = "firstname" ) String firstname);
   
   @Query("select p from person p where p.lastname :=lastname")
   public List<Person> getByLastname(@RequestParam(value = "lastname" ) String lastname);
   
}
