package com.hospitalpharmacy.Hospital.Pharmacy.System.services;

import org.springframework.stereotype.Service;

import com.hospitalpharmacy.Hospital.Pharmacy.System.controllers.dto.CreateFarmacoDto;
import com.hospitalpharmacy.Hospital.Pharmacy.System.entity.Farmaco;
import com.hospitalpharmacy.Hospital.Pharmacy.System.repositories.FarmacoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class FarmacoService {

	FarmacoRepository farmacoRepository;
	
	public Farmaco createFarmaco(CreateFarmacoDto dto) {
		var farmaco = dto.toFarmaco();
		farmacoRepository.save(farmaco);
		return farmaco;
	}

}
