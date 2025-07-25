/**
 * @(#)EmployeeRestController.java 2025/07/10.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/07/10.
 * Version 1.00.
 */
package poly.store.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poly.store.entity.UserRole;
import poly.store.service.UserRoleService;

/**
 * Class cung cap cac dich vu rest api cho bang employee
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/rest/employees")
public class EmployeeRestController {
	@Autowired
	UserRoleService userRoleService;
	
	@GetMapping()
	public List<UserRole> getAll() {
		return userRoleService.findAllAdminOrDirector();
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		userRoleService.delete(id);
	}
}
