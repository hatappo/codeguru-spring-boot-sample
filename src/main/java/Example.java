import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
import software.amazon.codeguruprofilerjavaagent.Profiler;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        new Profiler.Builder()
                .profilingGroupName("test-spring-boot-profiling-group01")
                .build().start();

        SpringApplication.run(Example.class, args);
    }

}
