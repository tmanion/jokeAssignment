package com.springframeworkguru.jokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ImportResource;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class JokeappApplication {
    /**
     * Creates a new JokeappApplication object.
     */
    public JokeappApplication() {
    }

    /**
     * DOCUMENT ME!
     *
     * @param  args
     */
    public static void main(final String[] args) {
        SpringApplication.run(JokeappApplication.class, args);
    }
}
