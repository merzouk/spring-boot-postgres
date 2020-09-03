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
 * Fichier 		:	PersonService.java
 * Créé le 		: 	3 sept. 2020 à 11:14:33
 * Auteur		: 	ryan
 * 
 * Description 	:
 * 
 *---------------------------------------------------------
 */

package org.com.services;

import org.com.dao.PersonDao;
import org.com.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * A Renseigner.
 * @author  : ryan
 * @project : spring-boot-postgres
 * @package : org.com.services
 * @date    : 3 sept. 2020 11:14:33
 */
@Service
public class PersonService
{
   @Autowired
   private PersonDao personDao;
   
   /**
    * 
    * @param email
    * @return
    * @throws Exception
    */
   @Transactional(readOnly = true, rollbackFor = Exception.class)
   public Person byEmail( String email ) throws Exception
   {
      if( !validateEmail( email ) )
      {
         throw new Exception( "email is not valid " + email );
      }
      return personDao.getByEmail( email );
   }
   
   private boolean validateEmail( String email )
   {
      if( email == null || email.trim().length() == 0 ) return false;
      String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
      java.util.regex.Pattern p = java.util.regex.Pattern.compile( ePattern );
      java.util.regex.Matcher m = p.matcher( email );
      return m.matches();
   }
}
