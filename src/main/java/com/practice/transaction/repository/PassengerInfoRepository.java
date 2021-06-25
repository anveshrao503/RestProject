package com.practice.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.transaction.entity.PassengerInfo;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
