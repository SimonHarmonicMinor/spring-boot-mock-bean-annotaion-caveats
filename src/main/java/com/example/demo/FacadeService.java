package com.example.demo;

import com.example.demo.enrich.EnrichmentService;
import com.example.demo.queue.QueueService;

public class FacadeService {

  private final QueueService queueService;
  private final EnrichmentService enrichmentService;

  public FacadeService(
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
