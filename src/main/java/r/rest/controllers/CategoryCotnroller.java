package r.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import r.rest.models.Category;
import r.rest.repositories.CategoryRepo;

@RestController
@RequestMapping("/")
public class CategoryCotnroller {

   @Autowired
   CategoryRepo categoryRepo;

   @GetMapping
   public List<Category> getCategories() {
      return categoryRepo.findAll();
   }

   @GetMapping("{id}")
   public Category getSingleCat(@PathVariable int id) {
      Category oldcat = categoryRepo.findById(id).orElse(null);
      return oldcat;
   }

   @PostMapping
   public String addCategory(@RequestBody Category cat) {
      categoryRepo.save(cat);
      return "Save Success";
   }

   @PutMapping("{id}")
   public String update(@PathVariable("id") int id, @RequestBody Category newCat) {

      Category oldcat = categoryRepo.findById(id).orElse(null);
      oldcat.setName(newCat.getName());
      oldcat.setImage(newCat.getImage());

      categoryRepo.save(oldcat);

      return "Update Success";

   }

   @DeleteMapping("{id}")
   public String deleteCat(@PathVariable int id) {
      Category oldcat = categoryRepo.findById(id).orElse(null);
      categoryRepo.delete(oldcat);

      return "Delete Success";
   }

   // Restful Services 
   // 1. Get Method
   // 2. Post Method 
   // 3. Put Method
   // 4. Delete
   // 5. Single Get

}
