/**
 * @(#)Role.java 2025/07/19.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/07/19.
 * Version 1.00.
 */
package poly.store.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class chua thong tin Role
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Roles")
public class Role implements Serializable {
	// Thong tin Role Id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// Thong tin Role Name
	private String name;

	// Lay danh sach User Role
	@JsonIgnore
	@OneToMany(mappedBy = "role")
	List<UserRole> listUserRole;
}
