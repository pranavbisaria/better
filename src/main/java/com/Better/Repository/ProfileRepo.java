package com.Better.Repository;

import com.Better.Models.Profile;
import com.Better.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo extends JpaRepository<Profile, Long> {
    Profile findByUser(User user);
}
