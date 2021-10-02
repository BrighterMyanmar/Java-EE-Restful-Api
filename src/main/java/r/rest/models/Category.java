package r.rest.models;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   int id;

   String name;
   String image;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getImage() {
      return this.image;
   }

   public void setImage(String image) {
      this.image = image;
   }

   public Category() {
   };

   public Category(int id, String name, String image) {
      this.id = id;
      this.name = name;
      this.image = image;
   }
}
