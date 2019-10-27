package aholdai.aholdaiserver.services.userservice;

import aholdai.aholdaiserver.models.AholdUser;

public interface UserService {

    AholdUser createUser(AholdUser newUser);

    AholdUser  getUserByEmail(String email);
}
