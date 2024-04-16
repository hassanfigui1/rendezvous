package com.rendez.vous.rendezvous.dao;

import com.rendez.vous.rendezvous.entity.AdminCentre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path ="admin")
public interface AdminCentreRepository extends JpaRepository<AdminCentre, Integer> {
}
