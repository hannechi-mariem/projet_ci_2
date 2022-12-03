package com.esprit.examen.entities.DTOS;

import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Produit;
import lombok.*;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FactureDTO {

    private Long idFacture;
    private float montantRemise;
    private float montantFacture;

    public Facture toEntity() {
        return Facture.builder()
                .idFacture(idFacture).montantFacture(montantFacture).montantRemise(montantRemise)
                .build();
    }
}

