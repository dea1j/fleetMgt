package com.dea1j.fleetMgt.services;

import com.dea1j.fleetMgt.models.Country;
import com.dea1j.fleetMgt.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }
}
