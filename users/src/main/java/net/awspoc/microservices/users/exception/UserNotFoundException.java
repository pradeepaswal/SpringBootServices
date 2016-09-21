package net.awspoc.microservices.users.exception;

import org.springframework.core.NestedRuntimeException;

/**
 * User not found exception
 * 
 */
public class UserNotFoundException extends NestedRuntimeException {
    public UserNotFoundException(String userId) {
        super(String.format("User with  Id '%s' not founded", userId));
    }

}
