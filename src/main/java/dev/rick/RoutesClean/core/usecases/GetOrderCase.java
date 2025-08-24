package dev.rick.RoutesClean.core.usecases;

import dev.rick.RoutesClean.core.domain.Order;

import java.util.List;

public interface GetOrderCase {

    public List<Order> execute();

}
