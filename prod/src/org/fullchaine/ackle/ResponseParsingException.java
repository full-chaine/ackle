package org.fullchaine.ackle;

public class ResponseParsingException extends Exception {

    public ResponseParsingException() {
    }

    public ResponseParsingException(final String detailMessage) {
        super(detailMessage);
    }

    public ResponseParsingException(final String detailMessage, final Throwable throwable) {
        super(detailMessage, throwable);
    }

    public ResponseParsingException(final Throwable throwable) {
        super(throwable);
    }
}
