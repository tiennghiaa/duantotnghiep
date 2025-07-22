/**
 * @(#)EmployeeForm.java 2025/05/10.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/05/10.
 * Version 1.00.
 */
package poly.store.model;

import lombok.AllArgsConstructor;

import lombok.NoArgsConstructor;

import lombok.Data;

/**
 * Class thong tin truy van cua bang Employee
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeForm {
	private int id;
	private String email;
	private String fullname;
	private String position;
	private String department;
	private String phone;
	private int salary;
	private String startday;
	private int role;
}
