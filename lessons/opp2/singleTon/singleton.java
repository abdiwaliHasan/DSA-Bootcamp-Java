package com.kunal.singleton;

import com.kunal.access.A;

public class singleton {
    private singleton() {

    }

    private static com.kunal.singleton.singleton instance;

    public static com.kunal.singleton.singleton getInstance() {
        // check whether 1 obj only is created or not
        if (instance == null) {
            instance = new com.kunal.singleton.singleton();
        }

        return instance;
    }

}