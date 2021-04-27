package com.cg.creditcardpayment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.creditcardpayment.entity.CustomerEntity;

/**
 * 
 * @author P Venkata Sai Reddy
 *
 */
@Repository
public interface ICustomerRepository extends JpaRepository<CustomerEntity, String>{
	/**
	 * 
	 * @param contactNo
	 * @return boolean
	 * 
	 */
	boolean existsByContactNo(String contactNo);
	/**
	 * 
	 * @param email
	 * @return boolean
	 * 
	 */
	boolean existsByEmail(String email);
	
}
