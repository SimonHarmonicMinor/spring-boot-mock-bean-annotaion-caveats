package com.example.demo;

import com.example.demo.enrich.EnrichmentService;
import com.example.demo.queue.QueueService;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

  private final QueueService queueService;
  private final EnrichmentService enrichmentService;

  public MessageService(
      QueueService queueService,
      EnrichmentService enrichmentService
  ) {
    this.queueService = queueService;
    this.enrichmentService = enrichmentService;
  }

  public void proceedMessage(String message) {
    final var trimmed = message.trim();
    final var enriched = enrichmentService.enrich(message);
    queueService.putMessage(message);
  }
}
