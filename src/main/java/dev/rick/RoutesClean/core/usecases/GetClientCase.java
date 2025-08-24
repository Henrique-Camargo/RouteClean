package dev.rick.RoutesClean.core.usecases;

import dev.rick.RoutesClean.core.domain.Client;

import java.util.List;

public interface GetClientCase {

    public List<Client> execute();
}
