package com.example.demo.enrich;

public class DummyEnrichmentService implements EnrichmentService {

  @Override
  public String enrich(String message) {
    return message;
  }
}
