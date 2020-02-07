package com.open.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.open.common.security.component.OpenAuth2ExceptionSerializer;

@JsonSerialize(using = OpenAuth2ExceptionSerializer.class)
public class InvalidException extends OpenAuth2Exception {

	public InvalidException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "invalid_exception";
	}

	@Override
	public int getHttpErrorCode() {
		return 426;
	}

}
