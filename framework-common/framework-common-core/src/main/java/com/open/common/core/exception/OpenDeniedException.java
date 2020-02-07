package com.open.common.core.exception;

import lombok.NoArgsConstructor;

/**
 * 403 授权拒绝
 */
@NoArgsConstructor
public class OpenDeniedException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public OpenDeniedException(String message) {
		super(message);
	}

	public OpenDeniedException(Throwable cause) {
		super(cause);
	}

	public OpenDeniedException(String message, Throwable cause) {
		super(message, cause);
	}

	public OpenDeniedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
