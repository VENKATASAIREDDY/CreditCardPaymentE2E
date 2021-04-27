package com.cg.creditcardpayment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.creditcardpayment.entity.LoginEntity;

/**
 * 
 * @author Shambhavi
 *
 */
@Repository
public interface ILoginRepository extends JpaRepository<LoginEntity, String>{
	
}
