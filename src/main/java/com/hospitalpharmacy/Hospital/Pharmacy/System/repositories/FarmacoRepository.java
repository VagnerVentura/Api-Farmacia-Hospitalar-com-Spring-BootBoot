package com.hospitalpharmacy.Hospital.Pharmacy.System.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalpharmacy.Hospital.Pharmacy.System.entity.Farmaco;

public interface FarmacoRepository extends JpaRepository<Farmaco,Long> {

}
