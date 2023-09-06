package com.demo.demoproperties.Repository;

import com.demo.demoproperties.model.UserProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPropertyRepo extends JpaRepository<UserProperty, String> {
}
