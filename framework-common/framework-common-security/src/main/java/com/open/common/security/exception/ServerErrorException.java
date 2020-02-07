
package com.open.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.open.common.security.component.OpenAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

@JsonSerialize(using = OpenAuth2ExceptionSerializer.class)
public class ServerErrorException extends OpenAuth2Exception {

	public ServerErrorException(String msg, Throwable t) {
		super(msg);
	}

	@Override
	public String getOAuth2ErrorCode() {
		return "server_error";
	}

	@Override
	public int getHttpErrorCode() {
		return HttpStatus.INTERNAL_SERVER_ERROR.value();
	}

}
