package com.addcustomer.addcustomer.controller;

import com.addcustomer.addcustomer.Pagination.Pager;
import com.addcustomer.addcustomer.entity.CustomerEntity;
import com.addcustomer.addcustomer.entity.ServiceEntity;
import com.addcustomer.addcustomer.entity.idTypeRent;
import com.addcustomer.addcustomer.entity.idTypeService;
import com.addcustomer.addcustomer.service.iDTypeServiceService;
import com.addcustomer.addcustomer.service.idTypeRentService;
import com.addcustomer.addcustomer.service.serviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
public class ServiceController {
    @Autowired
    serviceService serviceService;
    @Autowired
    idTypeRentService typeRentService;

    @Autowired
    iDTypeServiceService typeServiceService;

    private static final int BUTTONS_TO_SHOW = 5;
    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 5;
    private static final int[] PAGE_SIZES = {5, 10, 20};

    @ModelAttribute("typeServices")
    public Iterable<idTypeService> typeService(){
        return typeServiceService.findAll();
    }

    @ModelAttribute("typeRents")
    public Iterable<idTypeRent> typeRent(){
        return typeRentService.findAll();
    }


    @GetMapping("/admin/service")
    public ModelAndView home(Model model, @RequestParam("pageSize") Optional<Integer> pageSize,
                             @RequestParam("page") Optional<Integer> page) {

        ModelAndView modelAndView = new ModelAndView("displayService");

        // Evaluate page size. If requested parameter is null, return initial
        // page size
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        // Evaluate page. If requested parameter is null or less than 0 (to
        // prevent exception), return initial size. Otherwise, return value of
        // param. decreased by 1.

        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
        System.out.println("here is client repo " + serviceService.findAll());
        Page<ServiceEntity> serviceEntity = serviceService.findAll(PageRequest.of(evalPage, evalPageSize));
        System.out.println("client list get total pages" + serviceEntity.getTotalPages() + "client list get number " + serviceEntity.getNumber());
        Pager pager = new Pager(serviceEntity.getTotalPages(), serviceEntity.getNumber(), BUTTONS_TO_SHOW);
        modelAndView.addObject("service", serviceEntity);
        modelAndView.addObject("selectedPageSize", evalPageSize);
        modelAndView.addObject("pageSizes", PAGE_SIZES);
        modelAndView.addObject("pager", pager);

        return modelAndView;
    }

//    @GetMapping("/service/?pageSize={pageNumberSize}&{?page={pageNumber}")
//    public ModelAndView home(Model model, @PathVariable int pageNumber,@PathVariable int pageNumberSize,@RequestParam("pageSize") Optional<Integer> pageSize,
//                             @RequestParam("page") Optional<Integer> page) {
//
//        ModelAndView modelAndView = new ModelAndView("displayService");
//
//        // Evaluate page size. If requested parameter is null, return initial
//        // page size
//        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
//        // Evaluate page. If requested parameter is null or less than 0 (to
//        // prevent exception), return initial size. Otherwise, return value of
//        // param. decreased by 1.
//
//        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
//        System.out.println("here is client repo " + serviceService.findAll());
//        Page<ServiceEntity> serviceEntity = serviceService.findAll(PageRequest.of(evalPage, evalPageSize));
//        System.out.println("client list get total pages" + serviceEntity.getTotalPages() + "client list get number " + serviceEntity.getNumber());
//        Pager pager = new Pager(serviceEntity.getTotalPages(), serviceEntity.getNumber(), BUTTONS_TO_SHOW);
//        modelAndView.addObject("service", serviceEntity);
//        modelAndView.addObject("selectedPageSize", evalPageSize);
//        modelAndView.addObject("pageSizes", PAGE_SIZES);
//        modelAndView.addObject("pager", pager);
//       pageNumberSize=evalPageSize;
//       pageNumber=evalPage;
//        return modelAndView;
//    }


    @GetMapping("/addNewService")
    public String add(Model model) {
        ServiceEntity serviceEntity = new ServiceEntity();
        model.addAttribute("SERVICE", serviceEntity);
        model.addAttribute("ACTION1", "saveService");
        return "formService";
    }

    @GetMapping("/searchService")

    public ModelAndView Search(@RequestParam(required = false, name = "name") String name, @RequestParam("pageSize") Optional<Integer> pageSize,
                               @RequestParam("page") Optional<Integer> page) {
        ModelAndView modelAndView = new ModelAndView("displayService");
        // Evaluate page size. If requested parameter is null, return initial
        // page size
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        // Evaluate page. If requested parameter is null or less than 0 (to
        // prevent exception), return initial size. Otherwise, return value of
        // param. decreased by 1.
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
        System.out.println("here is client repo " + serviceService.search(name));
        Page<ServiceEntity> serviceEntities = serviceService.findByServiceNameContaining(name, PageRequest.of(evalPage, evalPageSize));
        System.out.println("client list get total pages" + serviceEntities.getTotalPages() + "client list get number " + serviceEntities.getNumber());
        Pager pager = new Pager(serviceEntities.getTotalPages(), serviceEntities.getNumber(), BUTTONS_TO_SHOW);
        modelAndView.addObject("service", serviceEntities);
        modelAndView.addObject("selectedPageSize", evalPageSize);
        modelAndView.addObject("pageSizes", PAGE_SIZES);
        modelAndView.addObject("pager", pager);
        return modelAndView;
    }


    @PostMapping("/saveService")
    public String list(RedirectAttributes redirect, @ModelAttribute("SERVICE") ServiceEntity serviceEntity) {

        serviceService.save(serviceEntity);
        redirect.addFlashAttribute("successMessage", "Lưu thông tin service thành công!");
//        model.addAttribute("CUSTOMER", customerService.findAll());
        return "redirect:/service";

    }

    @RequestMapping("/editService/{id}")
    public String edit(ModelMap model,
                       @PathVariable("id") Long id) {
        Optional<ServiceEntity> serviceEntity = serviceService.findById(id);
        if (serviceEntity.isPresent()) {
            model.addAttribute("CUSTOMER", serviceEntity.get());
        } else {
            model.addAttribute("CUSTOMER", new CustomerEntity());
        }
        model.addAttribute("CUSTOMER", serviceEntity);
        model.addAttribute("ACTION", "/save");
        return "formService";
    }

    @RequestMapping("/deleteService/{id}")

    public String delete(ModelMap model,RedirectAttributes redirect,
                         @PathVariable("id") Long id) {
        serviceService.deleteById(id);
        redirect.addFlashAttribute("successMessage", "Xóa tên service thành công!");
        return "redirect:/";
    }

    @ModelAttribute(name = "ALLSERVICE")
    public List<ServiceEntity> getAllService() {
        return serviceService.findAll();
    }
}
