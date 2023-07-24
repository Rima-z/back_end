package com.stage.backend.service;

import java.util.List;


import com.stage.backend.entity.Traitement;

public interface ITraitementService {
	Traitement addTraitement(Traitement traitement);
    List<Traitement> getAllTraitement();
    void deleteTraitement(int traitementId);
    void validerTraitment(Long traitementId);
    void asssignNomFile(String nomFile,Long id);
    
}
