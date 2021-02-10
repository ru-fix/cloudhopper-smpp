package com.cloudhopper.smpp.type;

import com.cloudhopper.smpp.SmppServerHandler;

/**
 * Thrown only in {@link SmppServerHandler#sessionCreated}.
 * Indicates the problem that prevents the binding process from finishing.
 * Must be used only for the cases when the problem occurred
 * <b>before</b> OK response sending to the client.
 * <BR>
 * Thus the right way to handle the exception is
 * to destroy the session and release resources.
 */
public class SessionCreatedFailedException extends Exception {
    public SessionCreatedFailedException(Throwable cause) {
        super(cause);
    }
}
