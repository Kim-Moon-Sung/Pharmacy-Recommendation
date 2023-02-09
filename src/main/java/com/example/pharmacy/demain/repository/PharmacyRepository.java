package com.example.pharmacy.demain.repository;

import com.example.pharmacy.demain.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Long> {
}
