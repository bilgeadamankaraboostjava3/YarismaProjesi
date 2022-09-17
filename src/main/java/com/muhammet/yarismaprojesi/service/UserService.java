package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.dto.request.DoLoginDto;
import com.muhammet.yarismaprojesi.repository.IUserRepository;
import com.muhammet.yarismaprojesi.repository.entity.User;
import com.muhammet.yarismaprojesi.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService extends ServiceManager<User,Long> {
    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        super(userRepository);
        this.userRepository = userRepository;
    }

    public Optional<User> doLogin(DoLoginDto doLoginDto) {
        return userRepository.findByUsernameAndPassword(doLoginDto.getUsername(), doLoginDto.getPassword());
    }

}
