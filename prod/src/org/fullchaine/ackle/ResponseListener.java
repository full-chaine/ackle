package org.fullchaine.ackle;

public interface ResponseListener<T> {
    void onResponse(T obj);

    void onParsingException(ResponseParsingException exception);
}
