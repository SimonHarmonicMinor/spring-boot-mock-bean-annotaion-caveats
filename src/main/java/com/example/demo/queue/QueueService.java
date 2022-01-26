package com.example.demo.queue;

import java.util.concurrent.Future;

public interface QueueService {
    void putMessage(String message);
}
