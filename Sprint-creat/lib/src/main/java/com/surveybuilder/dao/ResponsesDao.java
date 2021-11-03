package com.surveybuilder.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.surveybuilder.entities.Responses;

public interface ResponsesDao extends JpaRepository<Responses, Integer> {
	@Query(value="Select r From Responses r Where r.respondentId like ?1")
	List<Responses> findAllById(@Param("respondentId")int  respondentId);


	
	

}
