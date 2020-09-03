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
 * Fichier 		:	Person.java
 * Créé le 		: 	3 sept. 2020 à 10:34:04
 * Auteur		: 	ryan
 * 
 * Description 	:
 * 
 *---------------------------------------------------------
 */

package org.com.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * A Renseigner.
 * @author  : ryan
 * @project : spring-boot-postgres
 * @package : org.com.model
 * @date    : 3 sept. 2020 10:34:04
 */
@Entity(name = "person")
@Table
public class Person implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = -5450807399130318559L;
   
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   @Column(name = "id")
   private Integer           id;
   
   @Column(name = "firstname", length = 60, nullable = false, unique = false)
   private String            firstname;
   
   @Column(name = "lastname", length = 60, nullable = false, unique = false)
   private String            lastname;
   
   @Column(name = "email", length = 160, nullable = false, unique = true)
   private String            email;
   public Person()
   {
      super();
   }
   
   public Person( String firstname, String lastname, String email )
   {
      super();
      this.firstname = firstname;
      this.lastname = lastname;
      this.email = email;
   }
   
   public Person( Integer id, String firstname, String lastname, String email )
   {
      super();
      this.id = id;
      this.firstname = firstname;
      this.lastname = lastname;
      this.email = email;
   }
   
   public Integer getId()
   {
      return id;
   }
   
   public void setId( Integer id )
   {
      this.id = id;
   }
   
   public String getFirstname()
   {
      return firstname;
   }
   
   public void setFirstname( String firstname )
   {
      this.firstname = firstname;
   }
   
   public String getLastname()
   {
      return lastname;
   }
   
   public void setLastname( String lastname )
   {
      this.lastname = lastname;
   }
   
   public String getEmail()
   {
      return email;
   }
   
   public void setEmail( String email )
   {
      this.email = email;
   }
   
   @Override
   public String toString()
   {
      return "Person [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
   }
   
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ( ( email == null ) ? 0 : email.hashCode() );
      result = prime * result + ( ( firstname == null ) ? 0 : firstname.hashCode() );
      result = prime * result + ( ( id == null ) ? 0 : id.hashCode() );
      result = prime * result + ( ( lastname == null ) ? 0 : lastname.hashCode() );
      return result;
   }
   
   @Override
   public boolean equals( Object obj )
   {
      if( this == obj ) return true;
      if( obj == null ) return false;
      if( getClass() != obj.getClass() ) return false;
      Person other = (Person) obj;
      if( email == null )
      {
         if( other.email != null ) return false;
      }
      else if( !email.equals( other.email ) ) return false;
      if( firstname == null )
      {
         if( other.firstname != null ) return false;
      }
      else if( !firstname.equals( other.firstname ) ) return false;
      if( id == null )
      {
         if( other.id != null ) return false;
      }
      else if( !id.equals( other.id ) ) return false;
      if( lastname == null )
      {
         if( other.lastname != null ) return false;
      }
      else if( !lastname.equals( other.lastname ) ) return false;
      return true;
   }
}
