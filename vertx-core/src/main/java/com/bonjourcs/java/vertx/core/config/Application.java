package com.bonjourcs.java.vertx.core.config;

import com.bonjourcs.java.vertx.core.verticle.FirstVerticle;
import io.vertx.core.Vertx;

/**
 * @author Liang Chenghao
 * Description: main application
 * Date: 2018/10/30
 */
public class Application {

    public static void main(String... args) {

        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(FirstVerticle.class.getName());

    }
}
