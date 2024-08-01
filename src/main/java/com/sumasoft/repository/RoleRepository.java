package com.sumasoft.repository;

import com.sumasoft.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mukund.ghanwat on 01 Aug, 2024
 */

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Integer> {
}
