package com.udacity.gradle.builditbigger.backend;

import com.example.android.jokelib.Jokes;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.Random;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {
    @ApiMethod(name = "getJoke")
    public MyBean sayHi() {
        MyBean response = new MyBean();

        int sizeOfJokes = Jokes.listOfJokes().size();
        Random random = new Random();

        String getName = Jokes.listOfJokes().get(random.nextInt(sizeOfJokes));
        response.setData("Hi, " + getName);

        return response;
    }

}
