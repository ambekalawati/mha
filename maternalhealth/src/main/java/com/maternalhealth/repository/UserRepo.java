package com.maternalhealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.maternalhealth.entity.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {

	@Query("select password from UserEntity ue where ue.email=:email")
	public String getUserPassword(@Param("email") String email);
	
	@Query("select ue from UserEntity ue where ue.email = :email and ue.password = :password")
	public UserEntity findUserByEmailAndPassword(@Param("email") String email, String password);

}
