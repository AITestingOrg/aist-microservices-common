package org.aitesting.microservices.eventstore;

import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface Name {
    String value();
}
