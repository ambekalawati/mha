package com.mha.exception;

public class DataAccessException extends RuntimeException {
	private ErrorMessage error;

	public DataAccessException(ErrorMessage error) {
		this.error = error;
	}

	public ErrorMessage getError() {
		return error;
	}
}
