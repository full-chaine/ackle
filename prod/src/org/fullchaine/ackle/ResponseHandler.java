package org.fullchaine.ackle;

import org.apache.http.HttpResponse;

public interface ResponseHandler extends ResponseMatcher {
    void handle(HttpResponse in);
}
