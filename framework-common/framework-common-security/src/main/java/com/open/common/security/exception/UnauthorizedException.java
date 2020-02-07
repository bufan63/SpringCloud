
package com.open.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.open.common.security.component.OpenAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;
/**
 */
@JsonSerialize(using = OpenAuth2ExceptionSerializer.class)
public class UnauthorizedException extends OpenAuth2Exception {

	public UnauthorizedException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "unauthorized";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.UNAUTHORIZED.value();
	}

}
