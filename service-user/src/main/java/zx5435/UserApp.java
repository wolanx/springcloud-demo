package zx5435;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class UserApp {

    public static void main(String[] args) {
        new SpringApplicationBuilder(UserApp.class)
                .run(args);
    }

}
