package book_manage.controller;

import book_manage.pojo.Role;
import book_manage.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping("getRole")
    @ResponseBody
    public String getRoleController(){
        Role role = roleService.getRoleById(1);
        System.out.println(role);
        return role.toString();
    }

    @RequestMapping(value = "addOneRole" ,method = RequestMethod.GET)
    @ResponseBody
    public String addOneRoleController(){
        Role role = new Role();
        role.setId(100);
        role.setName("无敌");
        role.setNote("我在测试");
        roleService.addRole(role);
        return "successful";
    }
}
