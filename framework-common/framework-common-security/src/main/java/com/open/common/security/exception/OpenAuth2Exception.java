
package com.open.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pig4cloud.pig.common.security.component.PigAuth2ExceptionSerializer;
import lombok.Getter;
import org.springframework.security.oauth2.common.exceptions.OAuth2Exception;

/**
 * 自定义OAuth2Exception
 */
@JsonSerialize(using = PigAuth2ExceptionSerializer.class)
public class OpenAuth2Exception extends OAuth2Exception {
	@Getter
	private String errorCode;

	public OpenAuth2Exception(String msg) {
		super(msg);
	}

	public OpenAuth2Exception(String msg, String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}
}
