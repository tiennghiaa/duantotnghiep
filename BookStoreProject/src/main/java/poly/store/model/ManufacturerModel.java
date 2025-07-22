/**
 * @(#)ManufacturerModel.java 2025/07/21.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/07/21.
 * Version 1.00.
 */
package poly.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class thong tin truy van cua bang Manufacturer
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ManufacturerModel {
	private int id;
	private String name;
	private String banner;
	private String logo;
	private String describe;
}
