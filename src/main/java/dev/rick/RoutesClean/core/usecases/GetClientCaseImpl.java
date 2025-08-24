package dev.rick.RoutesClean.core.usecases;

import dev.rick.RoutesClean.core.domain.Client;

import java.util.List;

public class GetClientCaseImpl implements GetClientCase {

    @Override
    public List<Client> execute(Client client) {
        return List.of();
    }
}
