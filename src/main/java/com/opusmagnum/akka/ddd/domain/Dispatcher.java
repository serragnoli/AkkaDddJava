package com.opusmagnum.akka.ddd.domain;

import akka.actor.AbstractLoggingActor;
import akka.actor.Props;
import akka.japi.pf.ReceiveBuilder;

public class Dispatcher extends AbstractLoggingActor {

    public static class Basket {

        private final String product;

        public Basket(String product) {
            this.product = product;
        }

        public String getProduct() {
            return product;
        }
    }

    public Dispatcher() {
        receive(ReceiveBuilder
                .match(Basket.class, this::onBasket)
                .build()
        );
    }

    private void onBasket(Basket basket) {
        System.out.println(">>>>>>>>>>>>>>>> I can see: " + basket.getProduct());
    }

    public static Props props() {
        return Props.create(Dispatcher.class);
    }
}
