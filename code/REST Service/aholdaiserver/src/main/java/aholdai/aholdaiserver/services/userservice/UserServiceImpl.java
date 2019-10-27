package aholdai.aholdaiserver.services.userservice;

import aholdai.aholdaiserver.models.AholdUser;
import aholdai.aholdaiserver.repositories.aholdUserRepository.Base.aholdUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{

    private aholdUserRepository userRepository;

    @Autowired
    public UserServiceImpl (aholdUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public AholdUser createUser(AholdUser newUser) {
        return userRepository.createUser(newUser);
    }

    @Override
    public AholdUser getUserByEmail(String email) {
        return userRepository.getUserByEmail(email);
    }
}
