package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.models.Class;

public interface ClassRepository extends JpaRepository<Class, ID> {

    public Class findByNameAndDate(String name, String date);
}
