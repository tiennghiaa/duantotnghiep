/**
 * @(#)ResourcesConfig.java 2025/07/08.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/07/08.
 * Version 1.00.
 */
package poly.store.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * Class chua cac cau hinh cho he thong
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
@Configuration
public class ResourcesConfig {
	/**
	 * Cau hinh file validator.properties
	 * 
	 * @return thong tin ms
	 */
	@Bean("messageSource")
	public MessageSource getMessageSource() {
		ReloadableResourceBundleMessageSource ms = new ReloadableResourceBundleMessageSource();
		// Truyen duong dan validator.properties
		ms.setBasename("classpath:messages/validator");
		// Cho phep hien thi tieng viet
		ms.setDefaultEncoding("UTF-8");
		return ms;
	}
}
