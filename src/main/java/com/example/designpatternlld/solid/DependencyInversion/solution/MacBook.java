package com.example.designpatternlld.solid.DependencyInversion.solution;

import com.example.designpatternlld.solid.DependencyInversion.problem.Keyboard;
import com.example.designpatternlld.solid.DependencyInversion.problem.Mouse;

public class MacBook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}
