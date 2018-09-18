package com.example.demo.enums;

/**
 * @author Sanyam Goel created on 18/9/18
 */
public enum FlightSearchExceptionType {

    NoHandlerFoundException,
    Exception,
    HttpRequestMethodNotSupportedException,
    MethodArgumentNotValidException,
    MissingServletRequestParameterException,
    ConstraintViolationException,
    HttpMessageNotReadableException,
    HttpMediaTypeNotSupportedException,

    PgHibernateException,
    PgResourceNotFoundException;

    private FlightSearchExceptionType(){

    }
}
