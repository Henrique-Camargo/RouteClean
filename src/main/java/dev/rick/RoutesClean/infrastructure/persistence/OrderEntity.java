package dev.rick.RoutesClean.infrastructure.persistence;

import dev.rick.RoutesClean.core.domain.Client;
import dev.rick.RoutesClean.core.enums.Entrega;
import dev.rick.RoutesClean.core.enums.Pagamento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private ClientEntity client;

    @Enumerated(EnumType.STRING)
    private Entrega entrega;

    @Enumerated(EnumType.STRING)
    private Pagamento pagamento;

}
