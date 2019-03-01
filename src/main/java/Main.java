import spark.Spark;

import static spark.Spark.get;

public class Main {

    public static void main(String[] args) {
        Spark.port(8080);

        get("/", (req, res) -> "HELLO WORLD\n");
    }
}
