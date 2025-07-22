/**
 * @(#)RoleService.java 2025/05/10.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/05/10.
 * Version 1.00.
 */
package poly.store.service;

import java.util.List;

import poly.store.entity.Employee;
import poly.store.model.EmployeeModel;

/**
 * Class cung cap cac dich vu thao tac voi table Employee trong database
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
public interface EmployeeService {

	List<EmployeeModel> getListEmployee();

	void save(Employee employee);
	
}
