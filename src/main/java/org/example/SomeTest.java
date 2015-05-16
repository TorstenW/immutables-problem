package org.example;

import org.example.ids.ImmutableTestId;
import org.immutables.value.Value;

@Value.Immutable
public abstract class SomeTest {

   public abstract ImmutableTestId getTestId();
}
