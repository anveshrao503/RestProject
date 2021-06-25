package com.practice.transaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.transaction.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
