package com.testmodule2.demo.Controller;



import com.testmodule2.demo.Entity.CustomerEntity;
import com.testmodule2.demo.Pagination.Pager;
import com.testmodule2.demo.Service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {


    @Autowired
   customerService customerService;

    private static final int BUTTONS_TO_SHOW = 5;
    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 5;
    private static final int[] PAGE_SIZES = {5, 10, 20};


    @GetMapping("/products")
    public ModelAndView home(Model model, @RequestParam("pageSize") Optional<Integer> pageSize,
                             @RequestParam("page") Optional<Integer> page) {

        ModelAndView modelAndView = new ModelAndView("list");

        // Evaluate page size. If requested parameter is null, return initial
        // page size
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        // Evaluate page. If requested parameter is null or less than 0 (to
        // prevent exception), return initial size. Otherwise, return value of
        // param. decreased by 1.
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
        System.out.println("here is client repo " + customerService.findAll());
        Page<CustomerEntity> customerEntities = customerService.findAll(PageRequest.of(evalPage, evalPageSize));
        System.out.println("client list get total pages" + customerEntities.getTotalPages() + "client list get number " + customerEntities.getNumber());
        Pager pager = new Pager(customerEntities.getTotalPages(), customerEntities.getNumber(), BUTTONS_TO_SHOW);
        modelAndView.addObject("customers", customerEntities);
        modelAndView.addObject("selectedPageSize", evalPageSize);
        modelAndView.addObject("pageSizes", PAGE_SIZES);
        modelAndView.addObject("pager", pager);
        return modelAndView;
    }


    @GetMapping("/create-product")
    public String add(Model model) {
        CustomerEntity u = new CustomerEntity();
        model.addAttribute("CUSTOMER", u);
        model.addAttribute("ACTION", "save");
        return "form1";
    }

    @GetMapping("/search")

    public ModelAndView Search(@RequestParam(required = false, name = "name") String
                                       name, @RequestParam("pageSize") Optional<Integer> pageSize,
                               @RequestParam("page") Optional<Integer> page) {
        ModelAndView modelAndView = new ModelAndView("list");
        // Evaluate page size. If requested parameter is null, return initial
        // page size
        int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
        // Evaluate page. If requested parameter is null or less than 0 (to
        // prevent exception), return initial size. Otherwise, return value of
        // param. decreased by 1.
        int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
        System.out.println("here is client repo " + customerService.search(name));
        Page<CustomerEntity> customerEntities = customerService.findByTenHangContaining(name, PageRequest.of(evalPage, evalPageSize));
        System.out.println("client list get total pages" + customerEntities.getTotalPages() + "client list get number " + customerEntities.getNumber());
        Pager pager = new Pager(customerEntities.getTotalPages(), customerEntities.getNumber(), BUTTONS_TO_SHOW);
        modelAndView.addObject("customers", customerEntities);
        modelAndView.addObject("selectedPageSize", evalPageSize);
        modelAndView.addObject("pageSizes", PAGE_SIZES);
        modelAndView.addObject("pager", pager);
        return modelAndView;
    }


    @PostMapping("/save")
    public String list( @ModelAttribute("CUSTOMER") CustomerEntity customerEntity, BindingResult result,RedirectAttributes redirect
                      ) {

        if (result.hasErrors()) {
            return "form1";
        }
        customerService.save(customerEntity);
        redirect.addFlashAttribute("successMessage", "Lưu thông tin khách hàng thành công!");
//        model.addAttribute("CUSTOMER", customerService.findAll());
        return "redirect:/products";

    }

    @RequestMapping("/edit-product/{id}")
    public String edit(ModelMap model,
                       @PathVariable("id") Integer id) {
        Optional<CustomerEntity> customerEntity = customerService.findById(id);
        if (customerEntity.isPresent()) {
            model.addAttribute("CUSTOMER", customerEntity.get());
        } else {
            model.addAttribute("CUSTOMER", new CustomerEntity());
        }
        model.addAttribute("CUSTOMER2", customerEntity);
        model.addAttribute("ACTION", "/save");
        return "form1";
    }
@GetMapping("/exit")
public String exit() {

    return "redirect:/products";
}

    @RequestMapping("/delete-product/{id}")

    public String delete(ModelMap model, RedirectAttributes redirect,
                         @PathVariable("id") Integer id) {
        customerService.deleteById(id);
        redirect.addFlashAttribute("successMessage", "Xóa tên khách hàng thành công!");
        return "redirect:/products";
    }

    @ModelAttribute(name = "ALLCUSTOMER")
    public List<CustomerEntity> getAllCustomer() {
        return customerService.findAll();
    }


}
