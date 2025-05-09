package com.crup.app.exception;

import javax.management.RuntimeErrorException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND) 
public class ResourceNotFoundException  extends RuntimeErrorException{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private static Error error;
private String resourceName;
   private String fieldName;
   private String fieldValue;
   
   
public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
	super(error);
	this.resourceName = resourceName;
	this.fieldName = fieldName;
	this.fieldValue = fieldValue;
}


public String getResourceName() {
	return resourceName;
}


public void setResourceName(String resourceName) {
	this.resourceName = resourceName;
}


public String getFieldName() {
	return fieldName;
}


public void setFieldName(String fieldName) {
	this.fieldName = fieldName;
}


public String getFieldValue() {
	return fieldValue;
}


public void setFieldValue(String fieldValue) {
	this.fieldValue = fieldValue;
}


}
