package com.crup.app.repository;
import com.crup.app.model.*;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository //JpaRepository will automatically add this annotation
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
