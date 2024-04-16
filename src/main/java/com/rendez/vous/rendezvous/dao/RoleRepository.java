package com.rendez.vous.rendezvous.dao;

import com.rendez.vous.rendezvous.entity.Role;
import com.rendez.vous.rendezvous.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<User, Integer> {

}
