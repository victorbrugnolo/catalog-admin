package dev.victorbrugnolo.catalog.admin.domain;

public class AggregateRoot<ID extends Identifier> extends Entity<ID> {

  protected AggregateRoot(ID id) {
    super(id);
  }
}
