package com.opusmagnum.akka.ddd;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.opusmagnum.akka.ddd.client.SomeClient;
import com.opusmagnum.akka.ddd.infra.AkkaDddConfig;

public class App {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AkkaDddConfig());

        SomeClient client = injector.getInstance(SomeClient.class);

        client.buy("Maizena");
    }
}
