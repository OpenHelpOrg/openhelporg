package com.capstone.openhelp.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/users")
    public String profile(){
        return "profile";
    }

//    private UserRepository userDao;
//    private PasswordEncoder passwordEncoder;
//
//    public UserController(UserRepository userDao, PasswordEncoder passwordEncoder) {
//        this.userDao = userDao;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @GetMapping("/users")
//    public String showIndex(Model model){
//        List<User> users = userDao.findAll();
//        model.addAttribute("users", users);
//        return "users/users";
//    }
//
//    @GetMapping("/user/{id}")
//    public String showSingleUser(
//            @PathVariable long id,
//            Model model) {
//        User user = userDao.findById(id);
//        model.addAttribute("user", user);
//        return "users/single";
//    }
//
//    //HOME
//
//
//    //CREATE
//    @GetMapping("/create-user")
//    public String showCreateView(Model model){
//        model.addAttribute("user", new User());
//        return "users/create";
//    }
//
//    @PostMapping("create-user")
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
//    //! DELETE
//    @GetMapping("/users/delete-user/{id}")
//    public String showDelete(
//            @PathVariable long id,
//            Model model) {
//        model.addAttribute("id", id);
//        return "users/delete";
//    }
//    @PostMapping("/users/delete-user/{id}")
//    public String deleteUser(
//            @PathVariable long id) {
//        User user = userDao.findById(id);
//        userDao.delete(user);
//        return "redirect:/posts";
//    }
}

