package detectivecases.case3;

import detectivecases.case3.stage.Watchable;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@RequiredArgsConstructor
public class Main {

    public static void main(String[] args) {
        System.out.println("Ladies and Gents, the main event of this evening is about to happen");
        // magician enters the box
        System.out.println("1st: Let's verify that The Great Springhoff is in the box");
		ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        // dramatic pause
        System.out.println("2nd: Now, after just few seconds, let's open the box again");
        Watchable stage = context.getBean(Watchable.class);
        stage.watchVeryCarefully();
        // dramatic pause
        System.out.println("3rd: And now, just after few seconds again, let's open the box for the last time");
        context.close();
        // ovations
        System.out.println("That's all folks!");
    }
}
