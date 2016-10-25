
package rabbitmq;

import java.util.concurrent.TimeUnit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    final static String queueName = "concretepage";

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(RabbitMQConfig.class);
        ctx.refresh();        
        System.out.println("----------------------------------Message is being sent-------------------------------------------------------");
        RabbitTemplate rabbitTemplate = (RabbitTemplate) ctx.getBean("rabbitTemplate");
        MessageReceiver receiver = (MessageReceiver) ctx.getBean("receiver");
        
        rabbitTemplate.convertAndSend(queueName, "Hello: A");
        for(int i=0;i<10;i++){
        receiver.getCountDownLatch().await(1, TimeUnit.SECONDS);
        }
        
        ctx.close();
    }
}
