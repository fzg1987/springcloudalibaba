package com.fzg.consumer.Service;

import entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RocketMQMessageListener(consumerGroup = "myConsumer",topic = "orderTopic")
public class MessageService implements RocketMQListener<Order> {

    @Override
    public void onMessage(Order order) {
        log.info("新订单{},发短信通知用户",order);
    }
}
