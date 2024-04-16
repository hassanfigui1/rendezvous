package com.rendez.vous.rendezvous.dao;

import com.rendez.vous.rendezvous.entity.Centre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path ="centres")

public interface CentreRepository extends JpaRepository<Centre,Integer> {

}
