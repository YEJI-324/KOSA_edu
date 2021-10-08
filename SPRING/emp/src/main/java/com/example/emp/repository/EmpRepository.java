package com.example.emp.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.emp.model.EmpDto;

@RepositoryRestResource(collectionResourceRel = "empdto", path = "empdto")
public interface EmpRepository 
			extends PagingAndSortingRepository<EmpDto, Long> {
	
	List<EmpDto> findByEname(@Param("ename") String ename);

}
