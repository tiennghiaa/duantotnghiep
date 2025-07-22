/**
 * @(#)UserLogin.java 2025/05/09.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/05/09.
 * Version 1.00.
 */
package poly.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class lam viec voi form login.html
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserLogin {
	// Thong tin user name
	private String username;
	// Thong tin password
	private String password;
}
