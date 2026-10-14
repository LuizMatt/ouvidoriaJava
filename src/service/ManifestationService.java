package service;

import java.util.ArrayList;

import model.Manifestation;
import model.Manifestation.ManifestationType;

/* 
- Ao buscar por ID, lançar um erro se não encontrar

- Preciso ter um array list q armazene as manifestações
*/
public class ManifestationService {
    int nextId = 1;
    ArrayList<Manifestation> ManifestationsList = new ArrayList<>();

    public void create(Manifestation manifestation) {
        // Verifica se o campo está vazio ou se nunca foi preenchido
        if (manifestation.getTitle() == null || manifestation.getTitle().isBlank()) {
            System.out.println("You need to fill in all the fields.");
        }
        if (manifestation.getType() != ManifestationType.ELOGIO || manifestation.getType() != ManifestationType.SUGESTAO
                || manifestation.getType() != ManifestationType.RECLAMACAO) {
            System.out.println("Invalid type.");
        }
        if (manifestation.getDescription() == null || manifestation.getDescription().isBlank()) {
            System.out.println("You need to fill in all the fields.");
        } else {
            manifestation.setId(nextId++);
            ManifestationsList.add(manifestation);
        }
    }
    
    public Manifestation getById(int id){
        for (Manifestation manifestation : ManifestationsList) {
            if (manifestation.getId() == id) {
                return manifestation;
            }
        }
        return null;
    }
}
