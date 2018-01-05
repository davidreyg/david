package com.pe.ventas.facv1.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class MessageSecurityWebApplicationInitializer
extends AbstractSecurityWebApplicationInitializer {
	public MessageSecurityWebApplicationInitializer() {
        super(SecurityConfig.class);
    }
}
