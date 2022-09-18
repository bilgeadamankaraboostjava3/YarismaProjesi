package com.muhammet.yarismaprojesi.service;

import com.muhammet.yarismaprojesi.dto.request.DoLoginRequestDto;
import com.muhammet.yarismaprojesi.dto.request.RegisterRequestDto;
import com.muhammet.yarismaprojesi.mapper.IUserMapper;
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

    public Optional<User> doLogin(DoLoginRequestDto doLoginRequestDto) {
        return userRepository.findByUsernameAndPassword(doLoginRequestDto.getUsername(), doLoginRequestDto.getPassword());
    }

    /**
     *
     * @param dto
     * @return Eğer kullanıcı kayıtlı ise kayıt yapılamayıp false döner.
     */
    public boolean register(RegisterRequestDto dto){
        Optional<User> user = userRepository.findByUsername(dto.getUsername());
        if(user.isPresent()) return false;
        /*
        userRepository.save(User.builder()
                        .adsoyad(dto.getAdsoyad())
                        .username(dto.getUsername())
                        .password(dto.getPassword())
                .build());
                */
        save(IUserMapper.INSTANCE.toUser(dto));
        return true;
    }
}
