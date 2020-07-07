package com.dx.admindx;

public class CRemolque {

    private String id ;

    private  String remolque ;

    public CRemolque(String id, String remolque) {
        this.id = id;
        this.remolque = remolque;
    }

    public String getId() {
        return id;
    }

    public String getRemolque() {
        return remolque;
    }

    @Override
    public String toString() {
        return remolque;
    }
}
