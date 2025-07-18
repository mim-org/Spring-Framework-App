package com.pm.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") // by default -> @Scope("singleton")
public class Example {

    @Value("1")
    private int x;

    @Override
    public String toString() {
        return "Example{" +
                "x=" + x +
                '}';
    }
}
