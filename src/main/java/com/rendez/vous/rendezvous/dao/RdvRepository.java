package com.rendez.vous.rendezvous.dao;

import com.rendez.vous.rendezvous.entity.RDV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path ="rendezvous")
public interface RdvRepository extends JpaRepository<RDV, Integer> {
}
