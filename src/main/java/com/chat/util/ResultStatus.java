package com.chat.util;

public enum ResultStatus {

    SUCCESS( 200, "Success" ),
    FAILED( 500, "Failed" );

    private final String message;
    private int status;

    ResultStatus( final int status, final String message ) {
        this.status = status;
        this.message = message;
    }


    public String message() {
        return this.message;
    }

    public int status() {
        return this.status;
    }
}
