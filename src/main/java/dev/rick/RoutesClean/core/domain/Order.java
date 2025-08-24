package dev.rick.RoutesClean.core.domain;

import dev.rick.RoutesClean.core.enums.Entrega;
import dev.rick.RoutesClean.core.enums.Pagamento;

public record Order(
        Long id,
        Client client,
        Entrega entrega,
        Pagamento pagamento
) {
}
