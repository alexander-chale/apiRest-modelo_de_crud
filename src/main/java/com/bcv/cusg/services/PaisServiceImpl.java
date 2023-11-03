package com.bcv.cusg.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bcv.cusg.entities.Pais;
import com.bcv.cusg.repositories.BaseRepository;
import com.bcv.cusg.repositories.PaisRepository;

@Service
public class PaisServiceImpl extends BaseServiceImpl<Pais, Long> implements PaisService {

    @Autowired
    private PaisRepository paisRepository;

    public PaisServiceImpl(BaseRepository<Pais, Long> baseRepository) {
        super(baseRepository);
    }
}