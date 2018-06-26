package dao.daoimpl;

import dao.daoint.UserDAO;
import dao.entity.User;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by OmiD.HaghighatgoO on 05/28/2018.
 */
@Stateless
public class UserDaoImpl extends GenericDAOImpl<User ,Long> implements UserDAO {

    @PostConstruct
    public void init(){
        super.setClazz(User.class);
    }

    @PersistenceContext(unitName = "users")
    private EntityManager em;

    public void insert(User user) {
        em.persist(user);
     }




    public List<User> findAllUser() {
        return super.findAll();
    }
}
