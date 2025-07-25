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
 * Class thong tin truy van cua bang Products
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
	private int id;
	private String code;
	private String name;
	private int price;
	private int point;
	private int quality;
	private String description;
	private String specification;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	private boolean active;
	private int manuId;
	private int cateId;
	private String nameSearch;
	private String color;
	private String memory;
	private int sales;
}
