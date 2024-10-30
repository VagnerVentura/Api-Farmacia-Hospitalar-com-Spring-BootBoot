package com.hospitalpharmacy.Hospital.Pharmacy.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_prescricoesFarmacos")
public class PrescricaoFarmaco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "prescricao_id")
	private Prescricao prescricao;
	
	@ManyToOne
	@JoinColumn(name = "farmaco_id")
	private Farmaco farmaco;
	
	private int quantidadePrescrita;
}
