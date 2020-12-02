package com.platzimarket.domain.service;

import com.platzimarket.domain.Pursache;
import com.platzimarket.domain.repository.PursacheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PursacheService {
    @Autowired
    PursacheRepository pursacheRepository;

    public List<Pursache> getAll() {
        return pursacheRepository.getAll();
    }

    public Optional<List<Pursache>> getByClient(String clientId) {
        return pursacheRepository.getByClient(clientId);
    }

    public Pursache save(Pursache pursache) {
        return pursacheRepository.save(pursache);
    }

}
