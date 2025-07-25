/**
 * @(#)UserRegister.java 2025/06/08.
 * 
 * Copyright(C) 2025 by TEAM 1
 * 
 * Last_Update 2025/06/08.
 * Version 1.00.
 */
package poly.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class lam viec voi form register.html
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRegister {
	// Thong tin email
	private String email;

	// Thong tin ho va ten
	private String fullName;

	// Thong tin mat khau
	private String password;

	// Thong tin xac nhan mat khau
	private String confirmPassword;

	// Thong tin ma xac nhan
	private int code;

	// Thong tin xac nhan ma
	private String confirmCode;
	
	// Thong tin nhan thong bao
	private int subscribe;
	
	// Thong tin xac nhan dieu khoan
	private boolean confirmTerm;
}
