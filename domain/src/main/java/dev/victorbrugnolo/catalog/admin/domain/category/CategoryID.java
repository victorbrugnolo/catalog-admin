package dev.victorbrugnolo.catalog.admin.domain.category;

import dev.victorbrugnolo.catalog.admin.domain.Identifier;
import java.util.Objects;
import java.util.UUID;

public class CategoryID extends Identifier {

  private final String value;

  private CategoryID(String value) {
    Objects.requireNonNull(value);
    this.value = value;
  }

  public static CategoryID unique() {
    return CategoryID.from(UUID.randomUUID());
  }

  public static CategoryID from(String id) {
    return new CategoryID(id);
  }

  public static CategoryID from(UUID uuid) {
    return new CategoryID(uuid.toString().toLowerCase());
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryID that = (CategoryID) o;
    return getValue().equals(that.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getValue());
  }
}
