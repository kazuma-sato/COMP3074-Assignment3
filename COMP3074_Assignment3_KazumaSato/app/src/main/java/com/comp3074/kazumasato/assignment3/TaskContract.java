package com.comp3074.kazumasato.assignment3;

// COMP3064  Assignment 3
// Due: Nov 25, 2016
// Instructor: Ilir Dema
// Kazuma Sato 100 948 212 kazuma.sato@georgebrown.ca

import android.provider.BaseColumns;

public class TaskContract {

    public static final String DB_NAME = "com.comp3074.kazumasato.assignment3";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }
}