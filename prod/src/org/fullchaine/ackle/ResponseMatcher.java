package org.fullchaine.ackle;

import org.apache.http.HttpResponse;

public interface ResponseMatcher {
    boolean matches(HttpResponse in);
}
