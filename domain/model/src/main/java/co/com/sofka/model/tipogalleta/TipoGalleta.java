package co.com.sofka.model.tipogalleta;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class TipoGalleta {

    private String codigo;
    private String descripcion;

}
