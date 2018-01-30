package com.springframeworkguru.jokeapp.controllers;

import com.springframeworkguru.jokeapp.services.JokeService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;


/**
 * DOCUMENT ME!
 *
 * @version  $Revision$, $Date$
 */
@Controller public class JokesController {
    private JokeService jokeService;

    /**
     * Creates a new JokesController object.
     *
     * @param  jokeService
     */
    @Autowired public JokesController(final JokeService jokeService) {
        this.jokeService = jokeService;
    }

    /**
     * DOCUMENT ME!
     *
     * @param   model
     *
     * @return  String
     */

    @RequestMapping({ "/", "" })
    public String ShowJoke(final Model model) {
        model.addAttribute("joke", jokeService.getJoke());

        return "chucknorris";
    }
}
