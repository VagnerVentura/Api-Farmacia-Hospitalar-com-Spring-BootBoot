package com.hospitalpharmacy.Hospital.Pharmacy.System.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_farmacos")
public class Farmaco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do medicamento é obrigatório.")
	private String name;

    @NotNull(message = "A dosagem é obrigatória.")
	private Double dosagem;
    
	private String apresentação;
	
	@OneToMany(mappedBy = "farmaco")
	private List<PrescricaoFarmaco> prescricoes;
	
}
