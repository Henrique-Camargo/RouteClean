package dev.rick.RoutesClean.core.usecases;

import dev.rick.RoutesClean.core.domain.Order;

public interface CreateOrderCase {

    public Order execute(Order order);

}
