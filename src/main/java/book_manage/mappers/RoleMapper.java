package book_manage.mappers;

import book_manage.pojo.Role;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    public Role getRole(int id);
    @Insert("insert into t_role values(#{role.id},#{role.name},#{role.note})")
    public void insertRole(@Param("role") Role role);
}
