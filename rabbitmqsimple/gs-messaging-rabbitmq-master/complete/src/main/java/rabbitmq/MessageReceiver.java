package rabbitmq;

import java.util.concurrent.CountDownLatch;

/**
 *
 * @author vinay.gupta
 */
public class MessageReceiver {

    private CountDownLatch countDownLatch = new CountDownLatch(1);

    public void receiveMsg(String message) {
        System.out.println("Message Received>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>: " + message);
        countDownLatch.countDown();
    }

    public CountDownLatch getCountDownLatch() {
        return countDownLatch;
    }
}
