package pl.pdf.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pdf.demo.model.Users;
import pl.pdf.demo.repo.UsersRepo;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepo usersRepo;

    public List<Users> listAll() {
        return usersRepo.findAll();
    }
}
