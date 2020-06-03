package com.wp.sm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wp.sm.beans.User;
import com.wp.sm.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name = "userService")
    private UserService userService;

    /**
     * 根据id查询
     */
    @RequestMapping(value = "/selectUserById")
    public ModelAndView selectUserById(HttpServletRequest request) {
        ModelAndView mv = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        try {
            User user = userService.selectUserById(id);
            mv.setViewName("selectbyid");
            mv.addObject("user", user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

    @RequestMapping(value ="/delete",method=RequestMethod.DELETE)
    public String deleteById(int id) throws Exception {
        userService.deleteUser(id);
        return "redirect:show";
    }

    @RequestMapping(value ="/insertUserView")
    public String addUserView() {
        return "insert";
    }

    @RequestMapping(value = "/insert",method=RequestMethod.POST)
    public String insertUser(User user) throws Exception {
        userService.insertUser(user);
        return "redirect:show";
    }
    @RequestMapping(value ="/update/{id}",method=RequestMethod.GET)
    public String update(@PathVariable("id") int id, Model model) throws Exception {
        model.addAttribute("user",userService.selectUserById(id));
        return "update";
    }

    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public String update(User user) throws Exception {
        userService.updateUser(user);
        return "redirect:show";
    }

    @RequestMapping(value ="/show",method=RequestMethod.GET)
    public String userList(@RequestParam(required=true,defaultValue="1") Integer page, HttpServletRequest request, Model model) throws Exception {
        //page默认值是1，pageSize默认是10，意思是从第1页开始，每页显示10条记录。
        PageHelper.startPage(page, 10);
        List<User> userList = userService.selectAllUser();
        System.out.println(userList);
        PageInfo<User> p=new PageInfo<User>(userList);
        model.addAttribute("page", p);
        model.addAttribute("userList",userList);
        return "show";
    }

}
