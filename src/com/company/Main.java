package com.company;

public class Main {

    public static void main(String[] args) {
        TextPublisher textPublisher = new TitleTextPublisher();
        System.out.println(textPublisher.generateText());

        TextPublisher textPublisherUppercase = new UpperTextDecorator(textPublisher);
        System.out.println(textPublisherUppercase.generateText());
    }
}
