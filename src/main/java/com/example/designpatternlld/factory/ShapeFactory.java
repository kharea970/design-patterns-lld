package com.example.designpatternlld.factory;

public class ShapeFactory {
    Shape getShape(String shapeName) {
        return switch (shapeName) {
            case "Rectangle" -> new Rectangle();
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            default -> null;
        };
    }
}
