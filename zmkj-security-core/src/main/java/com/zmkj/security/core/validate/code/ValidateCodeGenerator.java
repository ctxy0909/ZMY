/**
 * 
 */
package com.zmkj.security.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author ct
 *
 */
public interface ValidateCodeGenerator {

	ValidateCode generate(ServletWebRequest request);
	
}
