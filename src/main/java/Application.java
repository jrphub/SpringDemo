import com.jrp.spring.config.AppConfig;
import com.jrp.spring.model.Speaker;
import com.jrp.spring.service.SpeakerService;
import com.jrp.spring.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * pass VM option in Run configuration : -Dspring.profiles.active=dev
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println("Speakers are ...");

        final List<Speaker> speakers = service.findAll();
        System.out.println(speakers.get(0).getFirstName());
        System.out.println(speakers.get(0).getSeedNum());
    }
}
