package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.Historiqued;


public interface IHistoriquedService {
	Historiqued addHistoriqued(Historiqued historiqued);
    List<Historiqued> getAllHistoriqued();
    void deleteHistoriqued(int historiquedId);
}
