package com.laioffer.Job.db;

public class MySQLDBUtil {
    private static final String INSTANCE = "laiproject-instance.c8mnkjyimjwh.us-east-2.rds.amazonaws.com";
    //private static final String INSTANCE = "laiproject-instance.cvxx7x48yjo6.us-east-1.rds.amazonaws.com";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "laiproject";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "a1234560";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";
}
