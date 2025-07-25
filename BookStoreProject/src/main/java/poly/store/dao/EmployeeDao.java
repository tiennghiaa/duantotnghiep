/**
 * @(#)EmployeeDao.java 2025/04/10.
 * 
 * Copyright(C) 2025 by TEAM 1.
 * 
 * Last_Update 2025/04/10.
 * Version 1.00.
 */
package poly.store.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import poly.store.entity.Employee;
import poly.store.model.EmployeeModel;

/**
 * Class thuc hien truy van thong tin bang Employee trong database
 * 
 * @author Dinh Hoa-ph
 * @version 1.00
 */
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	@Query("SELECT new EmployeeModel(e.user.Fullname, e.department, e.phone, e.position, e.user.birthday, e.Startday, e.salary) FROM Employee e WHERE e.Deleteday = null")
	List<EmployeeModel> getListEmployee();
	
	@Query("SELECT e FROM Employee e WHERE e.user.id = :uid")
	Employee getEmployeeByUserId(@Param("uid") Integer id);
}
