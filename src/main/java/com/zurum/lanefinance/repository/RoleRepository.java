package com.zurum.lanefinance.repository;

import com.zurum.lanefinance.constants.RoleEnum;
import com.zurum.lanefinance.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {

Role findRoleByName(RoleEnum roleEnum);
}
