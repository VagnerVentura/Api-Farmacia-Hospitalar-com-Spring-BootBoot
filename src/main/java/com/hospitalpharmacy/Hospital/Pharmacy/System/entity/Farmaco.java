package com.hospitalpharmacy.Hospital.Pharmacy.System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	
	
	public Farmaco(String name, @NotNull(message = "A dosagem é obrigatória.") String dosagem, String apresentacao) {
		
		this.name = name;
	    this.dosagem = dosagem;
	    this.apresentacao = apresentacao;
//	    this.prescricoes = new ArrayList<>(); // Inicialização lazy

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome do medicamento é obrigatório.")
	private String name;

    @NotNull(message = "A dosagem é obrigatória.")
	private String dosagem;
    
	private String apresentacao;
	
//	@OneToMany(mappedBy = "farmaco")
//	private List<PrescricaoFarmaco> prescricoes;
	
}
