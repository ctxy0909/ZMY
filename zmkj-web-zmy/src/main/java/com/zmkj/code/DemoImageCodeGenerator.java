/**
 * 
 *//*

package com.zmkj.code;

import com.zmkj.security.core.validate.code.ImageCode;
import com.zmkj.security.core.validate.code.ValidateCodeGenerator;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletWebRequest;



*/
/**
 * @author ct
 *
 *//*

@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

	*/
/* (non-Javadoc)
	 * @see com.zmkj.security.core.validate.code.ValidateCodeGenerator#generate(org.springframework.web.context.request.ServletWebRequest)
	 *//*

	@Override
	public ImageCode generate(ServletWebRequest request) {
		System.out.println("更高级的图形验证码生成代码");
		return null;
	}

}
*/
