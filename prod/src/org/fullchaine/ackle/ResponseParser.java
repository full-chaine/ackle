package org.fullchaine.ackle;

import org.apache.http.HttpResponse;

public interface ResponseParser<T> {
    T parse(HttpResponse in) throws ResponseParsingException;
}
