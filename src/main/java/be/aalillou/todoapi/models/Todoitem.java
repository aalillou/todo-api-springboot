package be.aalillou.todoapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Todoitem {

  @Id
  @GeneratedValue
  private Long id;

  private String name;
  private Boolean isComplete = false;

  public Todoitem() {
  }
}
