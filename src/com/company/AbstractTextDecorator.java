package com.company;

public abstract class AbstractTextDecorator implements TextPublisher{

    protected final TextPublisher textPublisher;

    protected AbstractTextDecorator(TextPublisher textPublisher) {
        this.textPublisher = textPublisher;
    }
}
