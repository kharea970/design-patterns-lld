package com.example.designpatternlld.solid.DependencyInversion.problem;

public class Macbook {
    private final WiredKeyboard wiredKeyboard;
    private final WiredMouse wiredMouse;

    public Macbook(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        this.wiredKeyboard = wiredKeyboard;
        this.wiredMouse = wiredMouse;
    }
}
