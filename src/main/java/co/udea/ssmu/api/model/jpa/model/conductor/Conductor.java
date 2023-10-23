package co.udea.ssmu.api.model.jpa.model.conductor;

import co.udea.ssmu.api.model.jpa.model.servicio.Servicio;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "conductor")
public class Conductor {

    //Columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conductor")
    private Integer idConductor;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "celular")
    private String celular;

    @Column(name = "email")
    private String email;

    @Column(name = "cedula")
    private String cedula;

    @Column(name = "rol")
    private String rol;

    @Column(name = "id_tipo_usuario")
    private Integer idTipoUsuario;

    @Column(name = "nro_servicios")
    private Integer nroServicios;

    @Column(name = "placa")
    private String placa;

    //Relaciones
    @OneToMany(mappedBy = "conductor", fetch = FetchType.LAZY)
    private List<Servicio> servicios;
}