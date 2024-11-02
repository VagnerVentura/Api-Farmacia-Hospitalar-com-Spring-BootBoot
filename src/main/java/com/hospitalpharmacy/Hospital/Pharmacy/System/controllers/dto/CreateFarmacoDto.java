package com.hospitalpharmacy.Hospital.Pharmacy.System.controllers.dto;

import com.hospitalpharmacy.Hospital.Pharmacy.System.entity.Farmaco;

import jakarta.validation.constraints.NotBlank;

public record CreateFarmacoDto(@NotBlank  String name, @NotBlank String dosagem, @NotBlank String apresentacao) {

	public Farmaco toFarmaco() {
		return new Farmaco(name, dosagem, apresentacao);
	}
	
}
