package io.intern.rms.services;

import io.intern.rms.domain.User;
import io.intern.rms.exceptions.EmailAlreadyExistsException;
import io.intern.rms.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Email;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    /*
    usernameはunique
    passwordはconfirmPasswordと一致しなければならない
    confirmPasswordは消す
     */
    public User saveUser (User newUser){
        try{
            newUser.setPassword(bCryptPasswordEncoder.encode(newUser.getPassword()));
            newUser.setEmail(newUser.getEmail());
            return userRepository.save(newUser);
        } catch (Exception e){
            throw new EmailAlreadyExistsException("Email '"+newUser.getEmail()+" ' is already exists");
        }

    }

}
