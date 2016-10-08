package kz.kaznitu.lessons.test.conf;

import kz.kaznitu.lessons.test.classes.JsonOutputGenerator;
import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("kz.kaznitu.lessons.test")
public class IOutputConf {
    @Bean("outputGenerator")
    public IOutputGenerator outputHelper(){
        return new JsonOutputGenerator() ;
    }
}
