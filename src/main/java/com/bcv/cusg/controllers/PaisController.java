package com.bcv.cusg.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bcv.cusg.entities.Pais;
import com.bcv.cusg.services.PaisServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/paises")
public class PaisController extends BaseControllerIdLongImpl<Pais, PaisServiceImpl> {
}
