package com.capstone.openhelp.controllers;


import com.capstone.openhelp.models.User;
import com.capstone.openhelp.repositories.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users/profile")
    public String profile(){
        return "users/profile";
    }

    private UserRepository userDao;

    private PasswordEncoder passwordEncoder;


//    public UserController(UserRepository userDao) {
//        this.userDao = userDao;
//    }
    public UserController(UserRepository userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/users")
    public String showIndex(Model model){
        List<User> users = userDao.findAll();
        model.addAttribute("users", users);
        return "users/users";
    }

    @GetMapping("/user/{id}")
    public String showSingleUser(
            @PathVariable long id,
            Model model) {
        User user = userDao.findById(id);
        model.addAttribute("user", user);
        return "users/singleuser";
    }

    //HOME


//    //CREATE
//    @GetMapping("/users/create")
//    public String showCreateView(Model model){
//        model.addAttribute("user", new User());
//        return "users/create";
//    }
//
//    @PostMapping("users/create")
//    public String createUser(
//            @ModelAttribute User user
//    ) {
//        String hash = passwordEncoder.encode(user.getPassword());
//        user.setPassword(hash);
//        userDao.save(user);
//        return "redirect:/user/"+user.getId();
//    }
//
//    //!EDIT
//    @GetMapping("/user/edit/{id}")
//    public String showEditView(
//            @PathVariable long id,
//            Model model) {
////        throws
////     PostException {
//        User user = userDao.findById(id);
////                .orElseThrow(()-> new PostException());
//        model.addAttribute("user", user);
//        return "users/edit";
//    }
//    @PostMapping("/user/edit/{id}")
//    public String editUser(
//            @ModelAttribute User user,
//            @PathVariable long id
//    ){
//        userDao.save(user);
//        return "redirect:/user/" + id;
//    }

    //! DELETE
    @GetMapping("/users/delete/{id}")
    public String showDelete(
            @PathVariable long id,
            Model model) {
        model.addAttribute("id", id);
        return "users/delete";
    }
    @PostMapping("/users/delete/{id}")
    public String deleteUser(
            @PathVariable long id) {
        User user = userDao.findById(id);
        userDao.delete(user);
        return "redirect:/events";
    }



    @GetMapping("/sign-up")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/sign-up")
    public String saveUser(@ModelAttribute User user){
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        userDao.save(user);
        return "login";
    }
}

