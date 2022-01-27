package com.example.demo.enrich;

import org.springframework.stereotype.Service;

@Service
public class DummyEnrichmentService implements EnrichmentService {

  @Override
  public String enrich(String message) {
    return message;
  }
}
