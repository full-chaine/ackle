package org.fullchaine.ackle;

import org.apache.http.HttpResponse;

public class DefaultResponseHandler<T> implements ResponseHandler {
    private final ResponseListener<T> listener;
    private final ResponseParser<T> parser;
    private final ResponseMatcher matcher;

    public DefaultResponseHandler(final ResponseParser<T> parser, final ResponseListener<T> listener, final ResponseMatcher matcher) {
        this.parser = parser;
        this.listener = listener;
        this.matcher = matcher;
    }

    @Override
    public void handle(final HttpResponse in) {
        try {
            listener.onResponse(parser.parse(in));
        }
        catch (ResponseParsingException e) {
            listener.onParsingException(e);
        }
    }

    @Override
    public boolean matches(final HttpResponse in) {
        return matcher.matches(in);
    }
}
