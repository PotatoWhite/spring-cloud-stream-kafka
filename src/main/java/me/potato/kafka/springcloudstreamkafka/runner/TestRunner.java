package me.potato.kafka.springcloudstreamkafka.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements ApplicationRunner {

    public final KafkaTemplate kafkaTemplate;

    public TestRunner(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Thread.sleep(1000);

        kafkaTemplate.send("topic01", "abcd");
    }
}
