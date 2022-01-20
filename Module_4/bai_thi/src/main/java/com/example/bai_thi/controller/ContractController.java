package com.example.bai_thi.controller;



import com.example.bai_thi.model.Contract;
import com.example.bai_thi.service.IContractService;
import com.example.bai_thi.service.IProductService;
import com.example.bai_thi.service.IProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.security.Principal;

@Controller
@RequestMapping("/contract")
public class ContractController {


    @Autowired
    private IProductService iProductService;

    @Autowired
    private IContractService iContractService;

    @Autowired
    private IProductTypeService iProductTypeService;


    @GetMapping
    public String ListPage(Model model, @RequestParam(value = "page", defaultValue = "0") Integer page) {



        Page<Contract> contractList = iContractService.findAll(PageRequest.of(page, 2));
        model.addAttribute("contractList", contractList);


        return "contract/list";
    }


    @GetMapping("/edit_param")
    public String showEditParam(@RequestParam(name = "id") Integer id, Model model, Principal principal) {

        model.addAttribute("contract", iContractService.findById(id));
        model.addAttribute("productList", iProductService.getAll());

        return "contract/edit";
    }

    @PostMapping("/edit")
    public String edit(@Valid  @ModelAttribute("contract") Contract contract, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) throws Exception {

        if (bindingResult.hasErrors()) {
            model.addAttribute("contract",contract);
            model.addAttribute("productList", iProductService.getAll());
            return "contract/edit";
        }

        iContractService.save(contract);
        redirectAttributes.addFlashAttribute("message", "Edit success");
        return "redirect:/contract";
    }
}


