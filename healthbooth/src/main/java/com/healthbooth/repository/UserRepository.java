package com.healthbooth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.healthbooth.entity.UserEntity;
import com.healthbooth.model.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	@Query("select ue from UserEntity ue where ue.email = :email and ue.password = :password")
	public UserEntity findUserByEmailAndPassword(@Param("email") String email, String password);

	@Query("select ue from UserEntity ue where ue.email = :email")
	public UserEntity findUserByEmail(@Param("email") String email);

	@Query("select password from UserEntity ue where ue.email=:email")
	public String getUserPassword(@Param("email") String email);

}
