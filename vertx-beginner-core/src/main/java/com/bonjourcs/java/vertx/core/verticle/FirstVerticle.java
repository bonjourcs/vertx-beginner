package com.bonjourcs.java.vertx.core.verticle;

import io.vertx.core.AbstractVerticle;

/**
 * @author Liang Chenghao
 * Description: a simple verticle shows current timestamp
 * Date: 2018/10/30
 */
public class FirstVerticle extends AbstractVerticle {

    @Override
    public void start() {

        vertx.createHttpServer().requestHandler(req -> req.response()
                .putHeader("Content-Type", "application/json;charset=utf-8")
                .end("{'version':'1.0','timestamp':" + System.currentTimeMillis() + "}"))
                .listen(8080);

    }
}
