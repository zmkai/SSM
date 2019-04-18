package book_manage.service;

import book_manage.mappers.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import book_manage.pojo.Role;

@Service("roleService")
@Transactional
public class RoleService {
    @Autowired
    RoleMapper mapper = null;

    public Role getRoleById(int id){
        return mapper.getRole(id);
    }

    public boolean addRole(Role role){
        mapper.insertRole(role);
        return true;
    }
}
