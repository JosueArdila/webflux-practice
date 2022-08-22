package co.com.sofka.genericadapter;

import co.com.sofka.model.tipogalleta.TipoGalleta;
import co.com.sofka.model.tipogalleta.gateways.TipoGalletaRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.Objects;

@Repository
public class TipoGalletasAdapter implements TipoGalletaRepository {
    @Override
    public Mono<TipoGalleta> findByCodigo(String codigo) {

        // pruebas estaticas sin acceso a una base de datos
        Flux<TipoGalleta> flux = Flux.fromIterable(
                Arrays.asList(
                        TipoGalleta.builder().codigo("COD001").descripcion("marías").build(),
                        TipoGalleta.builder().codigo("COD002").descripcion("tostadas y troqueladas").build(),
                        TipoGalleta.builder().codigo("COD003").descripcion("Cracker y de aperitivo").build(),
                        TipoGalleta.builder().codigo("COD004").descripcion("barquillos con o sin relleno").build(),
                        TipoGalleta.builder().codigo("COD005").descripcion("bizcochos secos y blandos").build(),
                        TipoGalleta.builder().codigo("COD006").descripcion("sandwiches").build(),
                        TipoGalleta.builder().codigo("COD007").descripcion("pastas blandas y duras").build(),
                        TipoGalleta.builder().codigo("COD008").descripcion("bañadas").build(),
                        TipoGalleta.builder().codigo("COD009").descripcion("cubiertas de chocolate").build(),
                        TipoGalleta.builder().codigo("COD010").descripcion("surtidas").build()
                )
        );
        return flux.filter(tipoGalleta -> Objects.equals(tipoGalleta.getCodigo(), codigo))
                .last();
    }


}
