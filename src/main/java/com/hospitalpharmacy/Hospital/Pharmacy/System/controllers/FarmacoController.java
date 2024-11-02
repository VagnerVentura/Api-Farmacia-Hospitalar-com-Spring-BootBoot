package com.hospitalpharmacy.Hospital.Pharmacy.System.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.hospitalpharmacy.Hospital.Pharmacy.System.controllers.dto.CreateFarmacoDto;
import com.hospitalpharmacy.Hospital.Pharmacy.System.entity.Farmaco;
import com.hospitalpharmacy.Hospital.Pharmacy.System.services.FarmacoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/farmacos")
public class FarmacoController {

	private FarmacoService farmacoService;
	
	@PostMapping
	public ResponseEntity<Farmaco> createFarmaco (@RequestBody CreateFarmacoDto dto, UriComponentsBuilder uriBuilder){
		var farmaco = farmacoService.createFarmaco(dto);
		var uri = uriBuilder.path("/farmacos/{id}").buildAndExpand(farmaco.getName()).toUri();
		return ResponseEntity.created(uri).body(farmaco);
	}
	
}
