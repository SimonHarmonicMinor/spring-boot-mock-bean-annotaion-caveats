package com.example.demo.queue;


import org.springframework.stereotype.Service;

@Service
public class DummyQueueService implements QueueService {

  @Override
  public void putMessage(String message) {
    // no op
  }
}
