/**
 * 
 */
package com.zmkj.security.core.validate.code.sms;

/**
 * @author ct
 *
 */
public interface SmsCodeSender {
	
	void send(String mobile, String code);

}
