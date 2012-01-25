package org.fullchaine.ackle;

import org.apache.http.client.methods.HttpUriRequest;

public interface Request {
    HttpUriRequest getHttpUriRequest();
}
