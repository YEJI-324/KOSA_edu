package com.example.simple_signin_login.repo;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.simple_signin_login.model.UserDto;


@RepositoryRestResource(collectionResourceRel = "userdto", path = "user")
public interface UserRepo extends PagingAndSortingRepository<UserDto, Long> {
		List<UserDto> findByemail(@Param("email") String email);
}
