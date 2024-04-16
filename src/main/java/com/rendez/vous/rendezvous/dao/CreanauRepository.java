package com.rendez.vous.rendezvous.dao;

import com.rendez.vous.rendezvous.entity.Creneau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path ="creneaux")


public interface CreanauRepository extends JpaRepository<Creneau, Integer> {
}
