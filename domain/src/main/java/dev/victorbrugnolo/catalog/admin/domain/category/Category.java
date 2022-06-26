package dev.victorbrugnolo.catalog.admin.domain.category;

import java.time.Instant;
import java.util.UUID;

public class Category {

  private final String id;
  private final String name;
  private final String description;
  private final boolean active;
  private final Instant createdAt;
  private final Instant updatedAt;
  private final Instant deletedAt;

  private Category(
      final String id,
      final String name,
      final String description,
      final boolean active,
      final Instant createdAt,
      final Instant updatedAt,
      final Instant deletedAt) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.active = active;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.deletedAt = deletedAt;
  }

  public static Category newCategory(
      final String aName,
      final String aDescription,
      final boolean aIsActive) {
    final var now = Instant.now();

    return new Category(
        UUID.randomUUID().toString(),
        aName,
        aDescription,
        aIsActive,
        now,
        now,
        null);
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public boolean isActive() {
    return active;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public Instant getDeletedAt() {
    return deletedAt;
  }
}
