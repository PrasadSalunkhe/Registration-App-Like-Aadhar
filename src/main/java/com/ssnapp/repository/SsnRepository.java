package com.ssnapp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ssnapp.entity.CitizenDataEntity;

public interface SsnRepository extends JpaRepository<CitizenDataEntity,Serializable> {

}
