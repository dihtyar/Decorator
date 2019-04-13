package com.company;

public class UpperTextDecorator extends AbstractTextDecorator {

    protected UpperTextDecorator(TextPublisher textPublisher) {
        super(textPublisher);
    }

    @Override
    public String generateText() {
        return textPublisher.generateText().toUpperCase();
    }
}
