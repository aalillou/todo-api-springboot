package be.aalillou.todoapi.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import be.aalillou.todoapi.models.Todoitem;
import be.aalillou.todoapi.repositories.TodoitemRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/api")
public class TodoapiController {

  @Autowired
  TodoitemRepository todoitemrepo;

  @GetMapping(value = "/todoitems")
  public List<Todoitem> todoitemlist() {
    return todoitemrepo.findAll();
  }

  @GetMapping(value = "todoitems/{id}")
  public Optional<Todoitem> retrieve(@PathVariable Long id) {
    return todoitemrepo.findById(id);
  }

  @PostMapping(value = "/todoitems")
  public ResponseEntity<Todoitem> newTodoitem(@RequestBody Todoitem todoitem) {
    Todoitem result = todoitemrepo.save(todoitem);
    return new ResponseEntity<Todoitem>(result, HttpStatus.CREATED);
  }

  @PutMapping(value = "/todoitems/{id}")
  public Todoitem update(
      @PathVariable Long id,
      @RequestBody Todoitem todoitem) {
    todoitem.setId(id);
    return todoitemrepo.save(todoitem);
  }

  @DeleteMapping(value = "/todoitems/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    todoitemrepo.deleteById(id);
  }
}
