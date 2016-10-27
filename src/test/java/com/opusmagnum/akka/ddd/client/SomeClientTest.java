package com.opusmagnum.akka.ddd.client;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@Ignore
@RunWith(MockitoJUnitRunner.class)
public class SomeClientTest {

    @InjectMocks
    private SomeClient client;

    @Test
    public void should_invoke_domain() {
        client.buy("A");

//        verify(actorRef);
    }
}
