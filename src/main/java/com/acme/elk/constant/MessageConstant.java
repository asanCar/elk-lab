package com.acme.elk.constant;

public final class MessageConstant {

    public static final String[] LOG_TYPE = {"CREATE", "UPDATE", "DELETE"};

    public static final String[] LOG_BLAMERS = {"CHARLES", "VICTOR", "ALEX", "OTHERS"};

    public static final String MESSAGE_PATTERN = "[%s] Example Log......";

    public static final String DELETE_MESSAGE_PATTERN = "[%s] Deleted by '%s'";
}
