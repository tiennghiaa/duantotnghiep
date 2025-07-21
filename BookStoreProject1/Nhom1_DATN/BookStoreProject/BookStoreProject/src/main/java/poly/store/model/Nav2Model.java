/**
 * @(#)EmployeeModel.java 2025/06/22.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/06/22.
 * Version 1.00.
 */
package poly.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class thong tin truy van cua bang MenuOne
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nav2Model {
	private int id;
	private String name;
	private int nav1Id;
	private String nameSearch;
}
