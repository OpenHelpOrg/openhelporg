package com.capstone.openhelp.controllers;

//
//import com.codeup.openhelp.exception.eventException;
//import com.codeup.openhelp.models.event;
//import com.codeup.openhelp.models.User;
//import com.codeup.openhelp.repositories.eventImageRepository;
//import com.codeup.openhelp.repositories.eventRepository;
//import com.codeup.openhelp.repositories.UserRepository;
//import com.codeup.openhelp.services.EmailService;
//import com.codeup.openhelp.services.eventService;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EventController {

//    MINIMUM MAPPING !!!!!!
    @GetMapping("/eventsindex")
    public String eventsIndex(){
        return "events/eventsindex";
    }





//    private final EventRepository eventDao;
//    private final UserRepository userDao;
//    private final eventImageRepository eventImageDao;
//    private final EmailService emailService;
////    private final eventService eventService;
////    private eventService eventService;
//W
//
//    public EventController(eventRepository eventDao, UserRepository userDao, eventImageRepository eventImageDao, EmailService emailService) {
//        this.EventDao = eventDao;
//        this.userDao = userDao;
//        this.eventImageDao = eventImageDao;
//        this.emailService = emailService;
//
//    }
//
////    public eventController(eventRepository eventDao, UserRepository userDao, eventImageRepository eventImageDao, EmailService emailService, eventService eventService) {
////        this.eventDao = eventDao;
////        this.userDao = userDao;
////        this.eventImageDao = eventImageDao;
////        this.emailService = emailService;
////        this.eventService = eventService;
////    }
//
//    //SHOW ALL
//    @GetMapping("/events")
//    public String all(Model model) {
//        List<Event> events = eventDao.findAll();
//        model.addAttribute("events", events);
//        List<User> users = userDao.findAll();
//        model.addAttribute("users", users);
//        return "events/index";
//    }
//
//    @GetMapping("/events/edit/{id}")
//    public String editeventForm
//            (@PathVariable Long id,
//             Model model){
//        model.addAttribute("event", eventDao.getOne(id));
//
//        return "events/edit";
//    }
//
//
//    @PostMapping("/events/edit")
//    public String editevent(@ModelAttribute Event event){
//        eventDao.save(event);
//        return "redirect:/events";
//    }
//
//
//    //CREATE
//    @GetMapping("/events/create")
//    public String createForm(Model model) {
//        model.addAttribute("event", new event());
//        return "create";
//    }
//
//    @PostMapping("/events/create")
//    public String createevent(@ModelAttribute event event){
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        event.setUser(user); //event model- set user to specific event
//        eventDao.save(event); //event repo extends jpa repo
//        emailService.prepareAndSend(event,"You just made a event","you just made a event"); //EmailService.java model
//        return "redirect:/events";
//    }
//
//    //DELETE  *** NOT SURE ON RETURN PATH
//
//    @GetMapping("/events/delete/{id}")
//    public String showDelete(
//            @PathVariable long id,
//            Model model) {
//        model.addAttribute("id", id);
//        return "/delete";
//    }
//
//
//    @PostMapping("/events/delete/{id}")
//    public String deleteevent(
//            @PathVariable long id){
//        eventDao.deleteById(id);
//        return "redirect:/events";
//    }
//
//    @GetMapping("/events/details/{id}")
//    public String returnOneToOneView(@PathVariable long id, Model model){
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        model.addAttribute("userId", user.getId());
//        model.addAttribute("event", eventDao.findById(id));
//        return "events/show";
//    }

}