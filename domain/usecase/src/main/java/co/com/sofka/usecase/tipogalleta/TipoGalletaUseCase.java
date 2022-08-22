package co.com.sofka.usecase.tipogalleta;

import co.com.sofka.model.tipogalleta.TipoGalleta;
import co.com.sofka.model.tipogalleta.gateways.TipoGalletaRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class TipoGalletaUseCase {

    private final TipoGalletaRepository tipoGalletaRepository;

    public Mono<TipoGalleta> findBy(String codigo) {
        return tipoGalletaRepository.findByCodigo(codigo);
    }
}
