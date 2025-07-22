/**
 * @(#)CategoryModel.java 2025/05/10.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/05/10.
 * Version 1.00.
 */
package poly.store.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class thong tin truy van cua bang Category
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryModel {
	private int id;
	private String name;
	private String banner;
	private String logo;
	private String describe;
	private String nameSearch;
}
