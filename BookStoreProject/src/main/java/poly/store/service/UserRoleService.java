/**
 * @(#)UserRoleService.java 2025/05/24.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/05/24.
 * Version 1.00.
 */
package poly.store.service;

import java.util.List;

import poly.store.entity.UserRole;

/**
 * Class cung cap cac dich vu thao tac voi table User_Role trong database
 * 
 * @author Dinh Hoa-PH
 * @version 1.00
 */
public interface UserRoleService{
	
	/**
	 * Luu user role vao database
	 * 
	 * @param userRole
	 */
	void save(UserRole userRole);

	List<UserRole> findAll();

	List<UserRole> findAllAdminOrDirector();

	void delete(Integer id);
	
}
