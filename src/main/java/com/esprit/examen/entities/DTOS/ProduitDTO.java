package com.esprit.examen.entities.DTOS;


import com.esprit.examen.entities.Produit;
import lombok.*;
import lombok.Setter;

@Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public class ProduitDTO {

    private Long idProduit;
    private String codeProduit;;
    private String libelleProduit;
    private float prix;

        public Produit toEntity() {
            return Produit.builder()
                    .idProduit(idProduit).codeProduit(codeProduit).libelleProduit(libelleProduit).prix(prix)
                    .build();
        }
    }

