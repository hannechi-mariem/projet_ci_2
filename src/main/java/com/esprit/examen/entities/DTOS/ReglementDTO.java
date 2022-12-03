package com.esprit.examen.entities.DTOS;


import com.esprit.examen.entities.Produit;
import com.esprit.examen.entities.Reglement;
import lombok.*;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReglementDTO {

    private Long idReglement;
    private float montantPaye;
    private float montantRestant;

    public Reglement toEntity() {
        return Reglement.builder()
                .idReglement(idReglement).montantPaye(montantPaye).montantRestant(montantRestant)
                .build();
    }
}

