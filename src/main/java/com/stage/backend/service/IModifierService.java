package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.Modifier;



public interface IModifierService {
	Modifier addModifier(Modifier modifier);
    List<Modifier> getAllModifier();
    void deleteModifier(int modifierId);

}
