package com.cg.creditcardpayment.dao;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.creditcardpayment.entity.StatementEntity;

/**
 * 
 * @author P Venkata Sai Reddy
 * 
 */
@Repository
public interface IStatementRepository extends JpaRepository<StatementEntity, Long>{
	/**
	 * 
	 * @param billDate
	 * @return <StatementModel> Object StatementEntity
	 * 
	 */
	StatementEntity findByBillDate(LocalDate billDate);
	
}
