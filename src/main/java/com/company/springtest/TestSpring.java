package com.company.springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //Задачка на создание радио.
        //Нужны:
        //бин проигрыватель c двумя методами играть песню, переключит радио
        //под каждое радио свой бин с методом играть песню

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Player radioPlayer = context.getBean("radioPlayer", Player.class);
        radioPlayer.playRadio();
        context.close();
    }
}
