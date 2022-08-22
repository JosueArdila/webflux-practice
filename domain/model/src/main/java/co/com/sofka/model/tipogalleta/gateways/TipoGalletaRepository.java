package co.com.sofka.model.tipogalleta.gateways;

import co.com.sofka.model.tipogalleta.TipoGalleta;
import reactor.core.publisher.Mono;

public interface TipoGalletaRepository {

    public Mono<TipoGalleta> findByCodigo(String codigo);
}
