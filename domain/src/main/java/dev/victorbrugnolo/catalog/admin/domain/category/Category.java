package dev.victorbrugnolo.catalog.admin.domain.category;

import dev.victorbrugnolo.catalog.admin.domain.AggregateRoot;
import java.time.Instant;

public class Category extends AggregateRoot<CategoryID> {
  private final String name;
  private final String description;
  private final boolean active;
  private final Instant createdAt;
  private final Instant updatedAt;
  private final Instant deletedAt;

  private Category(
      final CategoryID anId,
      final String aName,
      final String aDescription,
      final boolean isActive,
      final Instant aCreationDate,
      final Instant aUpdateDate,
      final Instant aDeleteDate) {
    super(anId);
    this.name = aName;
    this.description = aDescription;
    this.active = isActive;
    this.createdAt = aCreationDate;
    this.updatedAt = aUpdateDate;
    this.deletedAt = aDeleteDate;
  }

  public static Category newCategory(
      final String aName,
      final String aDescription,
      final boolean aIsActive) {
    final var now = Instant.now();

    return new Category(
        CategoryID.unique(),
        aName,
        aDescription,
        aIsActive,
        now,
        now,
        null);
  }

  @Override
  public CategoryID getId() {
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
