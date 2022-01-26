package com.example.demo.queue;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class DummyQueueService implements QueueService {

  @Override
  public void putMessage(String message) {
    // no op
  }
}
