package com.email.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class History {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	String firstName;
	String lastName;
	String recipientEmailAddress;
	String emailSubject;
	String emailBody;	
	
	public History() { }

	public History(Long id,String firstName,String lastName,String recipientEmailAddress,String emailSubject,String emailBody) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.recipientEmailAddress = recipientEmailAddress;
		this.emailSubject = emailSubject;
		this.emailBody = emailBody;		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName(){
		return lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getRecipientEmailAddress(){
		return recipientEmailAddress;
	}
	public void setRecipientEmailAddress(String recipientEmailAddress){
		this.recipientEmailAddress = recipientEmailAddress;
	}
	
	public String getEmailSubject(){
		return emailSubject;
	}
	public void setEmailSubject(String emailSubject){
		this.emailSubject = emailSubject;		
	}
	
	public String getEmailBody(){
		return emailBody;
	}
	public void setEmailBody(String emailBody){
		this.emailBody = emailBody;
	}
}
