package com.muhammet.yarismaprojesi.utility;

import com.muhammet.yarismaprojesi.repository.IUserRepository;
import com.muhammet.yarismaprojesi.repository.entity.User;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AdminImpl {

    private final IUserRepository userRepository;

    public AdminImpl(IUserRepository userRepository){
        this.userRepository = userRepository;
        Optional<User> user = this.userRepository.findByUsernameAndPassword("admin","admin");
        if(user.isEmpty())
            this.userRepository.save(User.builder()
                        .username("admin")
                        .password("admin")
                        .adsoyad("Yönetici")
                        .build());
    }
}
