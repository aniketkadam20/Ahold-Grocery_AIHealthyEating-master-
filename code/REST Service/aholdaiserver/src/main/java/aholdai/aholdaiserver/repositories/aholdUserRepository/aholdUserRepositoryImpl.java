package aholdai.aholdaiserver.repositories.aholdUserRepository;

import aholdai.aholdaiserver.models.AholdUser;
import aholdai.aholdaiserver.repositories.aholdUserRepository.Base.aholdUserRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class aholdUserRepositoryImpl implements aholdUserRepository {
    @Override
    public AholdUser getUserByEmail(String email) {
        return null;
    }

    @Override
    public AholdUser createUser(AholdUser newUser) {
        return null;
    }

//    @Autowired
//    private SessionFactory sessionFactory;


}
