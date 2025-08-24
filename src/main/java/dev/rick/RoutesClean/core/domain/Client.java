package dev.rick.RoutesClean.core.domain;

public record Client(
        Long id,
        String name,
        String cep,
        Integer frete
) {
}
