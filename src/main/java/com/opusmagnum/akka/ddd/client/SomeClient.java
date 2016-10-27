package com.opusmagnum.akka.ddd.client;

import akka.actor.ActorRef;
import com.opusmagnum.akka.ddd.domain.Dispatcher;

import javax.inject.Inject;

public class SomeClient {

    private final ActorRef dispatcher;

    @Inject
    public SomeClient(ActorRef dispatcher) {
        this.dispatcher = dispatcher;
    }

    public void buy(String product) {
        Dispatcher.Basket basket = new Dispatcher.Basket(product);

        dispatcher.tell(basket, ActorRef.noSender());
    }
}
