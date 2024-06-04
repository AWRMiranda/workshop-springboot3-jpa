package com.educandoweb.course.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant timestamp;
	private String status;
	private String error;
	private String message;
	private String path;

public StandardError(Instant instant, int i, String error2, String string, String string2) {
	
}

public StandardError(Instant timestamp, String status, String error, String message, String path) {
	super();
	this.timestamp = timestamp;
	this.status = status;
	this.error = error;
	this.message = message;
	this.path = path;
}

public Instant getTimestamp() {
	return timestamp;
}

public void setTimestamp(Instant timestamp) {
	this.timestamp = timestamp;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getError() {
	return error;
}

public void setError(String error) {
	this.error = error;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String getPath() {
	return path;
}

public void setPath(String path) {
	this.path = path;
}

}

	
	
	