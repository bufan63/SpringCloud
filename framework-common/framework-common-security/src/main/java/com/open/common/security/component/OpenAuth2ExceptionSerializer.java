package com.open.common.security.component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.open.common.core.constant.CommonConstants;
import com.open.common.security.exception.OpenAuth2Exception;
import lombok.SneakyThrows;

/**
 * OAuth2 异常格式化
 */
public class OpenAuth2ExceptionSerializer extends StdSerializer<OpenAuth2Exception> {
	public OpenAuth2ExceptionSerializer() {
		super(OpenAuth2Exception.class);
	}

	@Override
	@SneakyThrows
	public void serialize(OpenAuth2Exception value, JsonGenerator gen, SerializerProvider provider) {
		gen.writeStartObject();
		gen.writeObjectField("code", CommonConstants.FAIL);
		gen.writeStringField("msg", value.getMessage());
		gen.writeStringField("data", value.getErrorCode());
		gen.writeEndObject();
	}
}
