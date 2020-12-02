package com.platzimarket.persistence.mapper;

import com.platzimarket.domain.Pursache;
import com.platzimarket.domain.PursacheItem;
import com.platzimarket.persistence.entity.Compra;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PursacheItemMapper.class})
public interface PursacheMapper {
    @Mappings({
            @Mapping(source = "idCompra", target = "pursacheId"),
            @Mapping(source = "idCliente", target = "clientId"),
            @Mapping(source = "fecha", target = "date"),
            @Mapping(source = "medioPago", target = "paymentMethod"),
            @Mapping(source = "comentario", target = "comment"),
            @Mapping(source = "estado", target = "state"),
            @Mapping(source = "productos", target = "items"),
    })
    Pursache toPursache(Compra compra);
    List<Pursache> toPursaches(List<Compra> compras);

    @InheritInverseConfiguration
    @Mapping(target = "cliente", ignore = true)
    Compra toCompra(Pursache pursache);
}
