package co.udea.ssmu.api.model.jpa.mapper.servicio;

import co.udea.ssmu.api.model.jpa.dto.servicio.ServicioDTO;
import co.udea.ssmu.api.model.jpa.mapper.EntityMapper;
import co.udea.ssmu.api.model.jpa.model.jpa.servicio.Servicio;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ServicioMapper extends EntityMapper<ServicioDTO, Servicio> {
}
