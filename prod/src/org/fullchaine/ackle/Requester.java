package org.fullchaine.ackle;

import org.apache.http.client.methods.HttpUriRequest;

import java.util.List;
import java.util.concurrent.Future;

public interface Requester {
    Future<?> submit(final HttpUriRequest request, List<ResponseHandler> handlers);

    Future<?> submit(final RequestFactory requestFactory, List<ResponseHandler> handlers);
}
