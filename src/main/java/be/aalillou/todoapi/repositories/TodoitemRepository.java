package be.aalillou.todoapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import be.aalillou.todoapi.models.Todoitem;

public interface TodoitemRepository extends JpaRepository<Todoitem, Long> {}
