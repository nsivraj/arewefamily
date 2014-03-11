package org.arewefamily;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

public class PingVerticle extends Verticle {

  public void start() {
	final int port = 8888;
	
    vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
        @Override
        public void handle(HttpServerRequest httpServerRequest) {
            httpServerRequest.response().end("Hello smartjava");
        }
    }).listen(port);

    container.logger().info("Webserver started, listening on port: "+port);

  }
}