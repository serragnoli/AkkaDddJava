package com.opusmagnum.akka.ddd.infra;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.opusmagnum.akka.ddd.domain.Dispatcher;

public class AkkaDddConfig extends AbstractModule {
    @Override
    protected void configure() {

    }

    @Provides
    public ActorRef reactiveDispatcher() {
        ActorSystem system = ActorSystem.create("supermarket");

        return system.actorOf(Dispatcher.props(), "dispatcher");
    }
}
