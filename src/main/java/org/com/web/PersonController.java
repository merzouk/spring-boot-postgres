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
 * Fichier 		:	PersonController.java
 * Créé le 		: 	4 sept. 2020 à 00:05:25
 * Auteur		: 	ryan
 * 
 * Description 	:
 * 
 *---------------------------------------------------------
 */

package org.com.web;

import org.com.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * A Renseigner.
 * @author  : ryan
 * @project : spring-boot-postgres
 * @package : org.com.web
 * @date    : 4 sept. 2020 00:05:25
 */
@RestController
@RequestMapping("/persons")
public class PersonController
{
   @Autowired
   private PersonService personService;
   
}
