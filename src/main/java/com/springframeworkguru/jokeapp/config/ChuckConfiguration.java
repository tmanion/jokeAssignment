package com.springframeworkguru.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Configuration public class ChuckConfiguration {
    /**
     * Creates a new ChuckConfiguration object.
     */
    public ChuckConfiguration() {
    }

    /**
     * DOCUMENT ME!
     *
     * @return  ChuckNorrisQuotes
     */
    @Bean public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
