package co.udea.ssmu.api.model.jpa.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class InfoBancaria {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Bancario_id")
    private Long idBancario;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conductor_id")
    private Conductor conductor;

    @Column(length = 20, name = "numero_cuenta")
    private String numeroCuenta;

    @Column(length = 20, name = "tipo_cuenta")
    private String tipoCuenta;

    @Column(length = 40, name = "entidad_Bancaria")
    private String entidadBancaria;
}
