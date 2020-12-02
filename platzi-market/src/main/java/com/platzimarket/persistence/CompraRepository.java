package com.platzimarket.persistence;

import com.platzimarket.domain.Pursache;
import com.platzimarket.domain.repository.PursacheRepository;
import com.platzimarket.persistence.crud.CompraCrudRepository;
import com.platzimarket.persistence.entity.Compra;
import com.platzimarket.persistence.mapper.PursacheMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CompraRepository implements PursacheRepository {
    @Autowired
    private CompraCrudRepository compraCrudRepository;

    @Autowired
    private PursacheMapper mapper;

    @Override
    public List<Pursache> getAll() {
        return mapper.toPursaches((List<Compra>) compraCrudRepository.findAll());
    }

    @Override
    public Optional<List<Pursache>> getByClient(String clientId) {
        return compraCrudRepository.findByIdCliente(clientId).map(compras -> mapper.toPursaches(compras));
    }

    @Override
    public Pursache save(Pursache pursache) {
        Compra compra = mapper.toCompra(pursache);
        compra.getProductos().forEach(producto -> producto.setCompra(compra));
        return mapper.toPursache(compraCrudRepository.save(compra));
    }
}
