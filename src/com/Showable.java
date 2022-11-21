package com;

public interface Showable extends Printable,Digital {

    void show();

    @Override
    void print();
}
