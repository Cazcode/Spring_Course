package com.platzimarket.domain.repository;

import com.platzimarket.domain.Pursache;

import java.util.List;
import java.util.Optional;

public interface PursacheRepository {
    List<Pursache> getAll();
    Optional<List<Pursache>> getByClient(String clientId);
    Pursache save(Pursache pursache);
}
