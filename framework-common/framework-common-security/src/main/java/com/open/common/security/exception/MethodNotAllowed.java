
package com.open.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.open.common.security.component.OpenAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

@JsonSerialize(using = OpenAuth2ExceptionSerializer.class)
public class MethodNotAllowed extends OpenAuth2Exception {

	public MethodNotAllowed(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "method_not_allowed";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.METHOD_NOT_ALLOWED.value();
	}

}
