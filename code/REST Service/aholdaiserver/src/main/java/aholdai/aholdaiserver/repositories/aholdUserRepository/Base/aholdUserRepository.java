package aholdai.aholdaiserver.repositories.aholdUserRepository.Base;

import aholdai.aholdaiserver.models.AholdUser;

public interface aholdUserRepository {
    AholdUser getUserByEmail(String email);

    AholdUser createUser(AholdUser newUser);
}
