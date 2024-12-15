package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AccountEntity;

@Repository

public interface AccountRepository extends JpaRepository<AccountEntity, Integer> {
	@Override
	Optional<AccountEntity> findById(Integer userID);
}
