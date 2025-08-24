package dev.rick.RoutesClean.core.usecases;

import dev.rick.RoutesClean.core.domain.Client;

public interface CreateClientCase {

    public Client execute(Client client);
}
