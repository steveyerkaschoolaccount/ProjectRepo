/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Diagram.Composer.Javalin.Server;

import io.javalin.Javalin;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        String message = "This is the Diagram Composer Server";
        Javalin app = Javalin.create().start(7000);
        app.get("/get", ctx -> ctx.result(message));

    }
}
