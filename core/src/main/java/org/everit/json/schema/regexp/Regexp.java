package org.everit.json.schema.regexp;

import java8.util.Optional;

import static java.util.Objects.requireNonNull;

public interface Regexp {

    Optional<RegexpMatchingFailure> patternMatchingFailure(String input);

}

abstract class AbstractRegexp implements Regexp {

    private final String asString;

    AbstractRegexp(String asString) {
        this.asString = requireNonNull(asString, "asString cannot be null");
    }

    @Override public String toString() {
        return asString;
    }
}
