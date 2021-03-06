package Service.serviceimpl;

import Service.serviceint.UserService;
import dao.daoint.UserDAO;
import dao.entity.User;

import javax.ejb.Singleton;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import java.io.Serializable;
import java.util.List;

/**
 * Created by OmiD.HaghighatgoO on 06/10/2018.
 */

@Stateless
public class UserServiceImpl implements  UserService,Serializable {

    @Inject
    UserDAO userDAO ;

    public void createUser(User user) {
        userDAO.insert(user);

    }

    public List<User> loadAll(){
      return  userDAO.findAllUser();
    }

}
