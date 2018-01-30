package com.springframeworkguru.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import org.springframework.stereotype.Service;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Service public class JokeServiceImpl implements JokeService {
    private ChuckNorrisQuotes chuckNorrisQuotes;

    /**
     * Creates a new JokeService object.
     */
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    /**
     * Returns the quote value.
     *
     * @return  quote value.
     */
    @Override public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
