package com.esprit.examen.entities.DTOS;
import com.esprit.examen.entities.CategorieProduit;
import com.esprit.examen.entities.Produit;
import lombok.*;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CategorieProduitDTO {

    private Long idCategorieProduit;
    private String codeCategorie;
    private String libelleCategorie;

    public CategorieProduit toEntity() {
        return CategorieProduit.builder()
                .idCategorieProduit(idCategorieProduit).codeCategorie(codeCategorie).libelleCategorie(libelleCategorie)
                .build();
    }
}
