package com.stage.backend.service;

import java.util.List;

import com.stage.backend.entity.Historiquec;


public interface IHistoriquecService {
	Historiquec addHistoriquec(Historiquec historiquec);
    List<Historiquec> getAllHistoriquec();
    void deleteHistoriquec(int historiquecId);
}
