package com.smalik.initiator;

import java.time.OffsetDateTime;
import java.util.UUID;

public record Fruit(
        UUID id,
        String type,
        OffsetDateTime time) {
}
