package com.example.belajarcrud01.controllers;

import com.example.belajarcrud01.models.ProductModel;
import com.example.belajarcrud01.models.UsersModel;
import com.example.belajarcrud01.services.ProductService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.nio.file.Path;
import java.util.logging.Logger;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final Logger LOGGER = (Logger) LoggerFactory.getLogger(ProductController.class);

    private ProductService productService;

    @GetMapping("")
    public String show(Model model){
        model.addAttribute("product", productService.findAll());
        return "product/show";
    }

    @GetMapping("/create")
    public String create(){
        return "product/create"; }

    @PostMapping("/save")
    public String save(ProductModel productModel) {
        LOGGER.info("ProductModel receipt: " + productModel.toString());
        UsersModel usersModel = new UsersModel();
        usersModel.setId(1);
        productModel.setUserModel(usersModel);
        productService.save(productModel);
        return "redirect: /products";

    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model) {
        ProductModel productModel = productService.get(id);
        LOGGER.info("Receipt the productModel");
        model.addAttribute("productModel", productModel);
        return "products/edit";
    }
    @GetMapping("/update")
    public String update(ProductModel productModel) {
        productService.update(productModel);
        return "redirect: /products";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        productService.delete(id);
        return "redirect:/products";


    }
}

